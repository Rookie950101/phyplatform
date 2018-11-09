package com.cooperation.weixinpay.servlet;//


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by jackiechan on 18-8-13/下午12:04.
 */

public class ImageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage image = (BufferedImage) req.getSession().getAttribute("image");//获取存放的二维码
        if (image != null) {

            ImageIO.write(image, "JPEG", resp.getOutputStream());//发送到页面上
        }
    }
}
