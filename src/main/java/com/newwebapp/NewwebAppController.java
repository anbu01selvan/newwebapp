package com.newwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewwebAppController {
	@GetMapping(value = "getJenNewMsg")
	public String getJenMsg() {
		return "this is new jenkin";
	}
}
