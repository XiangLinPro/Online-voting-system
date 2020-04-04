package login;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.portable.InputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
 @Controller
public class UploadController {
	 @RequestMapping("/upload1")
	 public ModelAndView testFileUpload(String filename,MultipartFile file,HttpSession session) throws IOException{
	 	System.out.println("备注: " + filename);
	 	filename=file.getOriginalFilename();
	 	System.out.println("原文件名: " + filename);
	 	String path = session.getServletContext().getRealPath("/")+"files\\"+filename;
	     System.out.println(path);
	 	File f=new File(path);
	 	file.transferTo(f);
	 	String uripath="/SpringMVC/files/"+filename;
	 	ModelAndView modelAndView = new ModelAndView("download");
	 	modelAndView.addObject("filename", filename);
	 	modelAndView.addObject("uripath", uripath);
	 	return modelAndView;
	 }
	 @RequestMapping("/download")
	 public ResponseEntity<byte[]> downloadFlie (String filename,HttpSession session) throws IOException{
	 //得到要下载文件字节流
	 	ServletContext servletContext = session.getServletContext();
	 	java.io.InputStream in = servletContext.getResourceAsStream("/files/"+filename);
	 //将字节流文件转换为字节数组body：设置下载页面的内容
	 	byte [] body = new byte[in.available()];
	 	in.read(body);
	 //设置下载页面头
	 	HttpHeaders headers = new HttpHeaders();
	 	headers.add("Content-Disposition", "attachment;filename="+filename);
	 //设置下载页面的状态	
	 HttpStatus statusCode = HttpStatus.OK;
	 //根据页面内容、页面头、页面状态创建并跳转到该页面(实际返回的是下载文件数据)
	 	ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
	 	return response;
	 }


}