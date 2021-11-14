package com.example.service;

import com.example.Entity.Player;

public interface PlayerService {
	public Player searchPlayer(int ID);
	public void insertPlayer(Player player);
	public void deletePlayer(int ID);
}
