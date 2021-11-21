package com.example.service;

import java.util.List;
import com.example.Entity.Player;

public interface PlayerService {
	public Player IDfindPlayer(int id) throws Exception;
	public List<Player> searchPlayer(List<Integer> IDList,String set) throws Exception;
	public List<Player> searchAllPlayer() throws Exception;
	public Player insertPlayer(Player player) throws Exception;
	public int deletePlayer(int id) throws Exception;
	public int maxID() throws Exception;
}
