package com.pand.highlight_springmvc4.web.ch4_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

	@RequestMapping(produces = "text/plain;charset=UTF-8")
	public @ResponseBody String index(HttpServletRequest request) {
		return "url:" + request.getRequestURL() + " can access";
	}
	
	@RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String demoPathVar(@PathVariable String str, 
			HttpServletRequest request) {
		return "url:" + request.getRequestURL() + " can access,str: " + str;
	}
	
	@RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String passRequestParam(Long id, 
			HttpServletRequest request) {
		return "url:" + request.getRequestURL() + " can access,id: " + id;
	}
	//TODO
}
