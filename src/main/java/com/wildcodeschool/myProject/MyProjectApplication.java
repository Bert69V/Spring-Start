package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		return "<h1>Übersicht</h1>"
		+ "<ul>"
		+  "<li><a href=doctor/1>William Hartnell<a/></li>"
		+	"<li><a href=doctor/4>Tom Baker<a/></li>"
		+	"<li><a href=doctor/9>Christpher Eccleston<a/></li>"
		+	"<li><a href=doctor/13>Jodie Whittaker<a/></li>"
		+	"</ul>";
    }

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1(){
		return "William Hartnell";		
	}
	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4(){
		return "Tom Baker";
	}
	@RequestMapping("/doctor/9")
	@ResponseBody
	public String doctor9(){
		return "Christopher Eccleston";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String doctor13(){
		return "Jodie Whittaker";
	}
}