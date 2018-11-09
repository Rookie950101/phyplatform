package com.cooperation.promanager.controller;

import com.cooperation.promanager.dto.*;
import com.cooperation.promanager.pojo.ComProStd;
import com.cooperation.promanager.pojo.StdPro;
import com.cooperation.promanager.service.*;
import com.cooperation.weblog.annotation.WebOpLog;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductManagerController {

    //依赖服务层
    @Resource
    private ProTypeService proTypeService;  //类型库服务层
    @Resource
    private ComProStdService comProStdService;  //规格库服务层
    @Resource
    private TypeAndStdService typeAndStdService; //类型规格对应库
    @Resource
    private ProcateInfoService procateInfoService;  //类目表
    @Resource
    private ProFacService proFacService;  //生产厂商表
    @Resource
    private ProBandService proBandService;  //品牌库表
    @Resource
    private UnStdProService unStdProService;  //非标准化商品表
    @Resource
    private ProFmService proFmService;      //剂型库表
    @Resource
    private ApprovalInfoService approvalInfoService;  //批文基础信息表
    @Resource
    private BasMdcInfoService basMdcInfoService;     //基础药品信息表
    @Resource
    private MdcSkuInfoService mdcSkuInfoService;     //药品标准SKU表
    @Resource
    private MdcInfoService mdcInfoService;    //药品表
    @Resource
    private BasProInfoService basProInfoService;    //基础商品信息表
    @Resource
    private ProSkuInfoService proSkuInfoService;    //商品标准SKU表
    @Resource
    private StdProService stdProService;            //标准化商品
    @Resource
    private MdcCycleService mdcCycleService;       //药品回收站表
    @Resource
    private StdCycleService stdCycleService;       //标准化商品回收站表
    @Resource
    private UnstdCycleService unstdCycleService;    //非标准化商品回收站表



    //添加标准商品（审核通过后）
    @WebOpLog(operation = "添加标准商品（审核通过）")
    @RequestMapping("/addstdpro.do")
    public Map<String,Object> addStdPro(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //获取前端数据
        String protypename = request.getParameter("protypename");  //类型名称
        String prostdname = request.getParameter("prostdname");    //规格名称
        String procatename = request.getParameter("procatename");  //是否标准化
        String apronum = request.getParameter("apronum");            //批准文号
        String probandname = request.getParameter("probandname");  //品牌名称
        String profacname = request.getParameter("profacname");    //生产厂商名
        String proname = request.getParameter("proname");          //商品名
        String flag = request.getParameter("prostdname");
        Long showflag = Long.parseLong(flag);                         //上架标识

        //根据类型名获取类型id
        Long protypeid = proTypeService.findByName(protypename);
        //根据规格名获取规格id
        Long prostdid = comProStdService.findByName(prostdname);
        //填入类型规格对应表
        TypeAndStdDTO tsdto = new TypeAndStdDTO();
        tsdto.setProtypeid(protypeid);
        tsdto.setProstdid(prostdid);
        int i = typeAndStdService.insertRec(tsdto);
        //填入类目表
        //立即得到最新插入记录的id
        Long procateid = procateInfoService.insertRec(protypeid,procatename);

        //根据生产厂商名得到生产厂商id
        Long profacid = proFacService.findByName(profacname);
        //根据品牌名得到品牌id
        Long probandid = proBandService.findByName(probandname);
        //填入基础商品信息表
        //并立即得到主键
        Long baseproid = basProInfoService.insertRec(procateid,probandid,profacid,proname,apronum);
        //填入商品标准SKU表
        //并立即得到主键
        Long proskuid = proSkuInfoService.insertRec(baseproid,prostdid,prostdname);  //暂时先以规格为SKU字段
        //填入标准化商品表
        int j = stdProService.insertRec(proskuid,showflag);

        if (i>0&&j>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }

    //添加药品（审核通过后）
    @WebOpLog(operation = "添加药品（审核通过）")
    @RequestMapping("/addMdc.do")
    public Map<String,Object> addMdc(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //获取前端数据
        String protypename = request.getParameter("protypename");  //类型名称
        String prostdname = request.getParameter("prostdname");    //规格名称
        String procatename = request.getParameter("procatename");  //是否标准化
        String aproid = request.getParameter("aproid");            //批准文号
        String profmname = request.getParameter("profmname");      //剂型名称
        String profacname = request.getParameter("profacname");    //生产厂商名
        String mdcname = request.getParameter("mdcname");          //药品名
        String probandname = request.getParameter("probandname");  //品牌名称
        String flag = request.getParameter("showflag");
        Long showflag = Long.parseLong(flag);                         //上架标识

        //根据类型名获取类型id
        Long protypeid = proTypeService.findByName(protypename);
        //根据规格名获取规格id
        Long prostdid = comProStdService.findByName(prostdname);
        //填入类型规格对应表
        TypeAndStdDTO tsdto = new TypeAndStdDTO();
        tsdto.setProtypeid(protypeid);
        tsdto.setProstdid(prostdid);
        int i = typeAndStdService.insertRec(tsdto);
        //填入类目表
        //立即得到最新插入记录的id
        Long procateid = procateInfoService.insertRec(protypeid,procatename);

        //根据剂型名得到剂型id
        Long profmid = proFmService.findByName(profmname);
        //根据生产厂商名得到厂商id
        Long profacid = proFacService.findByName(profacname);
        //填入批文基础信息表
        int j = approvalInfoService.insertRec(aproid,profmid,profacid);
        //根据品牌名称得到品牌id
        Long probandid = proBandService.findByName(probandname);
        //填入基础药品信息表
        //立即得到最新插入记录的id
        Long basemdcid = basMdcInfoService.insertRec(mdcname,procateid,aproid,probandid);
        //填入药品标准SKU表
        //立即得到最新插入记录的id
        Long mdcskuid = mdcSkuInfoService.insertRec(basemdcid,prostdid,prostdname);  //以规格为SKU字段
        //填入药品表
        int k = mdcInfoService.insertRec(mdcskuid,showflag);

        if (i>0&&j>0&&k>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }

    //添加非标准商品（审核通过后）
    @WebOpLog(operation = "添加非标准商品（审核通过）")
    @RequestMapping("/addpro.do")
    public Map<String,Object> addPro(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        //获取前端数据
        String protypename = request.getParameter("protypename");   //类型名称
        String prostdname = request.getParameter("prostdname");     //规格名称
        String procatename = request.getParameter("procatename");   //是否标准化
        String profacname = request.getParameter("profacname");     //生产厂商名
        String probandname = request.getParameter("probandname");   //品牌名称
        String unstdproname = request.getParameter("unstdproname");  //非标准化商品名
        String showf = request.getParameter("showflag");            //上架标识
        Long showflag = Long.parseLong(showf);

        //根据类型名获取类型id
        Long protypeid = proTypeService.findByName(protypename);
        //根据规格名获取规格id
        Long prostdid = comProStdService.findByName(prostdname);
        //填入类型规格对应表
        TypeAndStdDTO tsdto = new TypeAndStdDTO();
        tsdto.setProtypeid(protypeid);
        tsdto.setProstdid(prostdid);
        int i = typeAndStdService.insertRec(tsdto);
        //填入类目表
        //立即得到类目id
        Long procateid = procateInfoService.insertRec(protypeid,procatename);

        //根据生产厂商名得到生产厂商id
        Long profacid = proFacService.findByName(profacname);
        //根据品牌名得到品牌id
        Long probandid = proBandService.findByName(probandname);
        //填入非标准化商品表
        int j = unStdProService.insertRec(profacid,probandid,procateid,unstdproname,showflag);

        if (i>0&&j>0){
            map.put("result","success");
            map.put("errortype","0");
        }else{
            map.put("result","error");
            map.put("errortype","-1");
        }
        return map;
    }


    //修改商品
    @WebOpLog(operation = "修改商品")
    @RequestMapping("/delepro.do")
    public Map<String,Object> delePro(HttpServletRequest request){

        return null;
    }

    //快速修改
    @WebOpLog(operation = "快速修改")
    @RequestMapping("/fastupdate.do")
    public Map<String,Object> fastUpdate(HttpServletRequest request){


        return null;
    }


    //下架商品（修改上下架标识，并移到回收站表）
    @WebOpLog(operation = "下架商品")
    @RequestMapping("/downpro.do")
    public Map<String,Object> downPro(HttpServletRequest request){


        return null;
    }

    //回收站删除商品
    @WebOpLog(operation = "回收站删除商品")
    @RequestMapping("/redelepro.do")
    public Map<String,Object> reDelePro(HttpServletRequest request){


        return null;
    }


    //上架商品（重新审核后，从回收站重新上架）
    @WebOpLog(operation = "上架商品（审核通过）")
    @RequestMapping("/uppro.do")
    public Map<String,Object> upPro(HttpServletRequest request){


        return null;
    }


    //导出商品信息为excel表格
    @WebOpLog(operation = "导出商品信息为excel")
    @RequestMapping("/exportpro.do")
    public Map<String,Object> exportPro(HttpServletRequest request){

        return null;
    }


    //*****************查询**********************

    /**
     * 查看回收站
     * 分类查询（标准化/非标准化）
     * 根据类目查询（一级类目、二级类目、三级类目）
     * 根据生产厂商（非标准商品）进行查询
     * 根据品牌（非标准商品）进行查询
     * ...
     */


    //查看药品回收站
    @WebOpLog(operation = "查看药品回收站")
    @RequestMapping("/listmdccy.do")
    public List<MdcCycleDTO> listMdcCy(HttpServletRequest request){
        List<MdcCycleDTO1> lis = new ArrayList<>();
        List<MdcCycleDTO> dtos = new ArrayList<>();
        //得到药品回收站全部记录
        lis = mdcCycleService.findAll();
        for (MdcCycleDTO1 mdto : lis){
            MdcCycleDTO dto = new MdcCycleDTO();
            Long mdcid = mdto.getMdcid();
            //根据mdcid得到mdcskuid
            Long mdcskuid = mdcInfoService.select2(mdcid);
            //根据mdcskuid得到规格名和基础药品信息表basemdcid（药品标准SKU表中的sku字段是规格名）
            MdcSkuInfoDTO mdcSkuInfoDTO = mdcSkuInfoService.select2(mdcskuid);
            //得到规格名
            String prostdname = mdcSkuInfoDTO.getMdcskuname();
            //得到基础药品信息表basemdcid
            Long basemdcid = mdcSkuInfoDTO.getBasemdcid();
            //根据basemdcid得到药品名和品牌库id
            BasMdcInfoDTO basMdcInfoDTO = basMdcInfoService.findById(basemdcid);
            //得到药品名
            String mdcname = basMdcInfoDTO.getMdcname();
            //得到品牌库id
            Long probandid = basMdcInfoDTO.getProbandid();
            //根据品牌id得到品牌名
            String probandname = proBandService.findNameById(probandid);

            //装配传到前端的数据传输对象
            dto.setMdccyid(mdto.getMdccyid());
            dto.setMdcid(mdcid);
            dto.setProstdname(prostdname);
            dto.setMdcname(mdcname);
            dto.setProbandname(probandname);

            //回收站表有多条记录，传回List
            dtos.add(dto);
        }
        return dtos;
    }


    //标准化商品回收站
    @WebOpLog(operation = "查看标准化商品回收站")
    @RequestMapping("/liststdcy.do")
    public List<StdCycleDTO> listStdCy(HttpServletRequest request){
        List<StdCycleDTO1> lis = new ArrayList<>();
        List<StdCycleDTO> dtos = new ArrayList<>();
        //得到标准化商品回收站全部记录
        lis = stdCycleService.findAll();
        for (StdCycleDTO1 sdto : lis){
            StdCycleDTO dto = new StdCycleDTO();
            Long stdproid = sdto.getStdproid();
            //根据 stdproid 得到 proskuid
            Long proskuid = stdProService.select3(stdproid);
            //根据proskuid得到规格名和基础商品信息表baseproid(商品标准SKU表中的SKU字段是以规格名)
            ProSkuInfoDTO proSkuInfoDTO = proSkuInfoService.select3(proskuid);
            //得到规格名
            String prostdname = proSkuInfoDTO.getProskuname();
            //得到基础商品信息表baseproid
            Long baseproid = proSkuInfoDTO.getBaseproid();
            //根据baseproid得到商品名和品牌库id
            BasProInfoDTO basProInfoDTO = basProInfoService.findById(baseproid);
            //得到商品名
            String proname = basProInfoDTO.getProname();
            //得到品牌库id
            Long probandid = basProInfoDTO.getProbandid();
            //根据品牌id得到品牌名
            String probandname = proBandService.findNameById(probandid);

            //装配传到前端的数据传输对象
            dto.setStdcyid(sdto.getStdcyid());
            dto.setStdproid(stdproid);
            dto.setProstdname(prostdname);
            dto.setProname(proname);
            dto.setProbandname(probandname);

            dtos.add(dto);
        }
        return dtos;
    }


    //查看非标准化商品回收站
    @WebOpLog(operation = "查看非标准化商品回收站")
    @RequestMapping("/listunstdcy.do")
    public List<UnstdCycleDTO> listUnstdCy(HttpServletRequest request){
        List<UnstdCycleDTO1> lis = new ArrayList<>();
        List<UnstdCycleDTO> dtos = new ArrayList<>();
        //得到非标准化商品全部记录
        lis = unstdCycleService.findAll();
        for (UnstdCycleDTO1 udto : lis){
            UnstdCycleDTO dto = new UnstdCycleDTO();
            Long proid = udto.getProid();



        }


        return null;
    }


 /*
    //查询非标准化商品
    @WebOpLog(operation = "查询非标准化商品")
    @RequestMapping("/getunstdpro.do")
    public List<DTO> getUnStdPro(HttpServletRequest request){



        return null;
    }


    //多条件查询
    @WebOpLog(operation = "多条件查询")
    @RequestMapping("/selectivepro.do")
    public List<DTO> selectivePro(HttpServletRequest request){



        return null;
    }
*/


}
