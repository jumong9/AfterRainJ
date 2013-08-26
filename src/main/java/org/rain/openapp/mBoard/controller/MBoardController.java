package org.rain.openapp.mBoard.controller;


import javax.annotation.Resource;

import org.rain.openapp.mBoard.service.MBoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mboard")
public class MBoardController extends GenericBoardController<Object> {
	
	@Resource(name="mboardService")
	private MBoardService mboardService;
	
	@RequestMapping(value="/list2")
	public String list(Model model) {
		System.out.println("/mboard/lists2");
		
		model.addAttribute("mboardList", mboardService.list());
		model.addAttribute("mboardListWolf", mboardService.list());
		return "/mboard/list";
	}
	
}
