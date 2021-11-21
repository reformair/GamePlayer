package com.example.service;

import java.util.List;

import com.example.Entity.GameResult;

public interface GameResultService {
	public List<GameResult> searchGameResult(int playerId) throws Exception;
	public GameResult insertGameResult(GameResult gameResult) throws Exception;
	public int deleteGameResult(int id) throws Exception;
}
