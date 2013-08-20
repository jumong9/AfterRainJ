package org.rain.openapp.mBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mboard")
public class MBoardController extends GenericBoardController<Object> {
	
	
	@RequestMapping(value="list2")
	public String list2(){
		System.out.println("/mboard/lists");
		return "/mboard/list";
	}

}
