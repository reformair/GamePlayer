package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.GameResultDAO;
import com.example.Entity.GameResult;

@Service
public class GameResultServiceimp implements GameResultService{

	@Autowired
	private GameResultDAO gameResultDAO;
	
	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_gameresultlist_'+#playerId")
	public List<GameResult> searchGameResult(int playerId) throws Exception {
		// TODO Auto-generated method stub
		try {
			return gameResultDAO.getGameResult(playerId);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CachePut(value ="redisCache",key ="'redis_gameresult_'+#gameResult.id")
	public GameResult insertGameResult(GameResult gameResult) throws Exception {
		// TODO Auto-generated method stub
		try {
			gameResultDAO.insertGameResult(gameResult);
			return gameResult;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CacheEvict(value ="redisCache",key ="'redis_gameresult_'+#id",beforeInvocation = false)
	public int deleteGameResult(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			return gameResultDAO.deleteGameResult(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

}
