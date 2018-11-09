package com.cooperation.weixinpay.servlet;//


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by jackiechan on 18-8-13/下午12:00.
 */

public class TestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        req.setCharacterEncoding("UTF-8");
        String price = "1";//此处默认是1分,次数需要项目开发中实际根据用户购买的商品获取
        String body = req.getParameter("body");//商品描述,获取用户前台输入的想要购买的商品,此处需要参考项目实际开发中获取
        if (req.getMethod().equalsIgnoreCase("get")) {
            body = new String(body.getBytes("ISO8859-1"), "UTF-8");
        }
        String orderId = random.nextInt(100000000) + "";//此处随机生成伪订单,实际开发中请参考项目需求生成
        try {
            String url = PayCommonUtil.weixin_pay(price, body, orderId);//获取微信返回的二维码对应的短地址
            BufferedImage image = ZxingUtil.createImage(url, 300, 300);//将地址转成二维码图片
            req.getSession().setAttribute("oid", orderId);//将订单号写入 session, 页面显示用
            req.getSession().setAttribute("image", image);//将图片放到 session 中
            resp.sendRedirect("/payment/payment.jsp");//跳转到支付页面,显示二维码
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
