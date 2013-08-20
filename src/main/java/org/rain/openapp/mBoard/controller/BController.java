package org.rain.openapp.mBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/bboard")
public class BController extends GenericBoardController<Object> {

}
