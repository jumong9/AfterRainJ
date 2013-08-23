package org.rain.openapp.mBoard.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;


public abstract class GenericBoardController<T> {

	@RequestMapping("/list")
	public List<T>  list(){
		List<T> list = null;
		System.out.println("generic list return");
		System.out.println("aaaaaaaaaaaaa");
		return  list;
	}
}
