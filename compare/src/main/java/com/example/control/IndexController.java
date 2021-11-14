package com.example.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Entity.Result;
import com.example.service.PlayerService;
import com.example.service.PlayerServiceimp;
import com.example.service.ResultService;

@Controller
public class IndexController {
	
	@Autowired
	private PlayerService playerService;
	@Autowired
	private ResultService resultService;
	@RequestMapping("/index")
	public String index()
	{
		System.out.print(playerService.searchPlayer(1).getName());
		return "index";
	}
	@RequestMapping("/test")
	public String testp()
	{
		System.out.print(resultService.searchResult("go-to-turkey",1).getGame_results());
		return "test1";
	}
}
