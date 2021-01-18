<%@page import="java.io.FileInputStream"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="java.io.File"%>
<%@page contentType="image/jpeg" pageEncoding="UTF-8"%>
<%
    String path = "/Users/vincenttuan/NetBeansProjects/EasyLifeSpringData/src/main/java/files/mango.jpg";
    FileInputStream fis = new FileInputStream(new File(path));
    BufferedImage image = ImageIO.read(fis);
    ImageIO.write(image, "JPEG", response.getOutputStream());
%>
