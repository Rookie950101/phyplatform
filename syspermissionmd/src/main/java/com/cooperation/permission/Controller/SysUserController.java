package com.cooperation.permission.Controller;

import com.cooperation.permission.pojo.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController //相当于@Controller  +  @ResponseBody 表示这个controller下返回的都是json格式数据，不能做页面跳转
public class SysUserController {

    //用户登录
    @RequestMapping("/syslogin.do")
    public String login(String username, String password, HttpServletRequest request){
        HttpSession session = request.getSession();

        System.out.println("用户名："+ username);
        System.out.println("密码："+ password);

        //获取当前用户对象
        Subject subject = SecurityUtils.getSubject();
        //生成令牌（传入用户输入的账号和密码）
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        //认证登录
        try{
            //这里会加载自定义的realm
            //把令牌放到login里面进行查询，如果查询账号和密码时候匹配，如果匹配就把对象获取出来，失败就抛异常
            subject.login(token);
            //获取登录成功的用户对象（以前是直接去service里面查）
            SysUser sysUser = (SysUser)subject.getPrincipal();
            session.setAttribute("user",sysUser);
            //返回json格式的字符串，前端根据这个标识，做页面跳转
            return "success";
        }catch(Exception e){
            //认证登录失败抛出异常
            //返回json格式的字符串，前端根据这个标识，做页面跳转
            return "error";
        }
    }

    //注销
    @RequestMapping("/logout.do")
    public void logout(){
        //无需写任何内容
    }


}
