package com.kosmo.k10spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import component.scan.MyService;

@Controller
public class ServiceController {

	//서비스객체를 자동주입 받는다.
	MyService myService;
	
	@Autowired
	public void setMyService(MyService myService) {
		this.myService = myService;
		System.out.println("setMyService()호출-ServiceController");
	}
	
	
	@RequestMapping("/service/myService.do")
	public String myService() {
		
		myService.execute();
		return "07Service/myService";
	}
}
