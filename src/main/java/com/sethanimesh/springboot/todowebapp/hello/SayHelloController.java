package com.sethanimesh.springboot.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"say-hello" => "Hello! How are you?"

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! How are you?";
	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h2>My First HTML page</h2>");
		sb.append("</body>");
		return sb.toString();
	}

	//sayHello.jsp
	//"say-hello-jsp"=>sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}


