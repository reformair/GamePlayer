package com.example.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Player;
import com.example.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/insertplayer")
	@ResponseStatus(HttpStatus.OK)
	public boolean AddPlayer(@RequestBody Player requestbody){
		if(requestbody.getName() != null)
			return true;
		else
			return false;
	}
	@GetMapping("/queryplayer")
	@ResponseStatus(HttpStatus.OK)
	public List<Player> FindAllPlayer(){
		List<Player> plist = new ArrayList<>();
		try {
			Player p = new Player();
			Player p1 = new Player();
			p.setId(1);
			p.setName("player1");
			p1.setId(2);
			p1.setName("player2");
			plist.add(p);
			plist.add(p1);
			return plist;
		} catch(Exception e) {
			return null;
		}
	}
	@GetMapping("/deleteplayer")
	@ResponseStatus(HttpStatus.OK)
	public boolean DelPlayer(@RequestParam int requestbody){
		boolean deleteSuccess = true;
		return deleteSuccess;
	}
	@GetMapping("/findplayer")
    @ResponseStatus(HttpStatus.OK)
	public List<Player> FindPlayer(@RequestParam int[] List){
		List<Integer> list1 = Arrays.stream(List).boxed().collect(Collectors.toList());
		List<Player> plist = new ArrayList<>();
		try {
			Player p = new Player();
			Player p1 = new Player();
			p.setId(1);
			p.setName("player1");
			p1.setId(2);
			p1.setName("player2");
			plist.add(p);
			plist.add(p1);
			return plist;
		} catch(Exception e) {
			return null;
		}
	}
}
