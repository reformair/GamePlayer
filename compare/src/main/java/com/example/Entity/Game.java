package com.example.Entity;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable {
	private static final long serialVersionUID =7760614561073458248L;
	private int id;
	private String gameMapName = "Empty";
	private Date dateOfGame;
	private String game_results = "Empty";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameMapName() {
		return gameMapName;
	}
	public void setGameMapName(String gameMapName) {
		this.gameMapName = gameMapName;
	}
	public Date getDateOfGame() {
		return dateOfGame;
	}
	public void setDateOfGame(Date dateOfGame) {
		this.dateOfGame = dateOfGame;
	}
	public String getGame_results() {
		return game_results;
	}
	public void setGame_results(String game_results) {
		this.game_results = game_results;
	}
}
