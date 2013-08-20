package org.rain.openapp.controller;

import org.rain.openapp.GenericBoardController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/bboard")
public class BController extends GenericBoardController<Object> {

}
