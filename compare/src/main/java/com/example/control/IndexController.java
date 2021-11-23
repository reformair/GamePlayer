package com.example.control;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Entity.Game;
import com.example.Entity.GameResult;
import com.example.Entity.Parameter;
import com.example.Entity.Player;
import com.example.service.EventService;
import com.example.service.FormulaService;
import com.example.service.GameResultServiceimp;
import com.example.service.GameService;
import com.example.service.ParameterService;
import com.example.service.PlayerService;

@Controller
public class IndexController {
	
	@Autowired
	private ParameterService parameterService;
	
	@Autowired
	private FormulaService formulaService;
	
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/index")
	public String index()
	{
		Logger logger = LoggerFactory.getLogger(IndexController.class);
		
		try {
			Parameter p = new Parameter();
			Parameter p1;
			p.setKey("1");
			p.setValue("test");
			System.out.print(formulaService.IDfindFormula(1));
			p1 = (Parameter)eventService.IDfindEvent("test", 100);
			System.out.print(p1.getKey());
			System.out.print(eventService.deleteEvent("test", 100));
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
		return "index";
	}
	@RequestMapping("/test")
	public String testp()
	{
		System.out.print("");
		return "test1";
	}
}
