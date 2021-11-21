package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.GameDAO;
import com.example.Entity.Game;

@Service
public class GameServiceimp implements GameService{

	@Autowired
	private GameDAO gamedao;
	
	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_game_'+#id")
	public Game IDfindGame(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			return gamedao.findGame(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_gamelist_'+#set")
	public List<Game> searchGame(List<Integer> IDList, String set) throws Exception {
		// TODO Auto-generated method stub
		List<Game> ret = new ArrayList<>();
		try {
			ret.addAll(gamedao.getGame(IDList));
			return ret;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CachePut(value ="redisCache",key ="'redis_game_'+#game.id")
	public Game insertGame(Game game) throws Exception {
		// TODO Auto-generated method stub
		try {
			if(gamedao.findGame(game.getId()) != null)
				return null;
			else
				gamedao.insertGame(game);
				return game;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CacheEvict(value ="redisCache",key ="'redis_game_'+#id",beforeInvocation = false)
	public int deleteGame(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			if(gamedao.findGame(id) == null)
				return 0;
			else
				return gamedao.deleteGame(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	public int maxID() throws Exception {
		// TODO Auto-generated method stub
		try {
			return gamedao.getMaxGameID();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

}
