package com.green.nowon.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemoController {
	
	@GetMapping("/memo")
	public String mail() {
		return "views/cs/list/memo";
	}
	

}
