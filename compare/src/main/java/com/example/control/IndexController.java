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
import com.example.Entity.Player;
import com.example.service.GameResultServiceimp;
import com.example.service.GameService;
import com.example.service.PlayerService;

@Controller
public class IndexController {
	
	@Autowired
	private PlayerService playerService;
	@Autowired
	private GameService gameService;
	@Autowired
	private GameResultServiceimp gameResultServiceimp;
	
	@RequestMapping("/index")
	public String index()
	{
		Logger logger = LoggerFactory.getLogger(IndexController.class);
		GameResult set = new GameResult();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
	    String input = "1818-11-11";
	    SimpleDateFormat ftt = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss.SSSSSS");
	    String inputt = "1818-11-11 11:22:33.000000";
		try {
			Date date = ft.parse(input);
			Date date1 = new Date(System.currentTimeMillis());
			Timestamp ts = new Timestamp(date1.getTime());
			set.setId(2);
			set.setPlayerId(2);
			set.setGameMapName("go-to-shanghai");
			set.setDateOfGame(date);
			set.setLeague(2);
			set.setGameCommentary("test");
			set.setCreationDate(date1);
			System.out.print(gameResultServiceimp.searchGameResult(1).get(0).getGameCommentary());
			System.out.print(gameResultServiceimp.insertGameResult(set));
			System.out.print(gameResultServiceimp.deleteGameResult(2));
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
