package com.example.service;

import java.util.List;
import com.example.Entity.Game;

public interface GameService {
	public Game IDfindGame(int id) throws Exception;
	public List<Game> searchGame(List<Integer> IDList,String set) throws Exception;
	public Game insertGame(Game game) throws Exception;
	public int deleteGame(int id) throws Exception;
	public int maxID() throws Exception;
}
