package com.example.Entity;

import java.io.Serializable;
import java.util.Date;

public class GameResult implements Serializable {
	private static final long serialVersionUID = 7760614561073458249L;
	private int id;
	private int playerId;
	private String gameMapName;
	private Date dateOfGame;
	private int league;
	private int averageSpeed;
	private int gameDuration;
	private String gameCommentary;
	private Date creationDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
	public int getLeague() {
		return league;
	}
	public void setLeague(int league) {
		this.league = league;
	}
	public int getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(int averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	public int getGameDuration() {
		return gameDuration;
	}
	public void setGameDuration(int gameDuration) {
		this.gameDuration = gameDuration;
	}
	public String getGameCommentary() {
		return gameCommentary;
	}
	public void setGameCommentary(String gameCommentary) {
		this.gameCommentary = gameCommentary;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
