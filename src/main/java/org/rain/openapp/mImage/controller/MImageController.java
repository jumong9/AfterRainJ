package org.rain.openapp.mImage.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mimage")
public class MImageController {

	@RequestMapping("/getimg")
	public void getimg(){
		System.out.println("/mimage/getimg");
	}
	
	
	@RequestMapping(value="/getImg")
	public String getImg(){
		System.out.println("/mimage/getImg");
		
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new URL("http://timg.danawa.com/prod_img/500000/123/453/img/1453123_1.jpg").openStream();
			File newImg = new File("d:/1453123_1.jpg");
			
			os = new FileOutputStream(newImg);
			
			int i=0;
			while((i = is.read())!= -1){
				os.write(i);
			}
			os.flush();
				
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(os!=null) {
				try { os.close(); } catch (IOException e) {	e.printStackTrace(); }
			}
			if(is!=null){
				try { is.close(); } catch (IOException e) { e.printStackTrace(); }
			}
		}
		return "/mimage/getimg";
	}
	
	
	@RequestMapping(value="/getimgio")
	public String getImgIo(){
		System.out.println("/mimage/getImgIo");
		
		BufferedImage newImg;
		
		try {
			
			//get image from url
			newImg = ImageIO.read(new URL("http://timg.danawa.com/prod_img/500000/123/453/img/1453123_1.jpg"));
			System.out.println("height="+newImg.getHeight() + " width=" +newImg.getWidth() );
			ImageIO.write(newImg, "jpg", new File("d:/12345.jpg"));
			
			
			//make different size image
			newImg = Scalr.resize(newImg, Mode.AUTOMATIC, 300,300);
			ImageIO.write(newImg, "jpg", new File("d:/12345_small.jpg"));
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return "/mimage/getimg";
	}
	
	
}
