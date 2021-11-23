package com.example.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.FormulaDAO;
import com.example.DAO.ParameterDAO;
import com.example.DAO.PlayerDAO;
import com.example.Entity.Formula;
import com.example.Entity.Parameter;
import com.example.Entity.Player;

@Service
public class PlayerServiceimp implements PlayerService{

	@Autowired
	private PlayerDAO playerdao;
	
	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_userlist_'+#set")
	public List<Player> searchPlayer(List<Integer> IDList,String set) throws Exception{
		// TODO Auto-generated method stub
		List<Player> ret = new ArrayList<>();
		try {
			ret.addAll(playerdao.getPlayer(IDList));
			return ret;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CachePut(value ="redisCache",key ="'redis_user_'+#player.id")
	public Player insertPlayer(Player player) throws Exception {
		// TODO Auto-generated method stub
		try {
			if(playerdao.findPlayer(player.getId()) != null)
				return null;
			else
				playerdao.insertPlayer(player);
				return player;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@CacheEvict(value ="redisCache",key ="'redis_user_'+#id",beforeInvocation = false)
	public int deletePlayer(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			if(playerdao.findPlayer(id) == null)
				return 0;
			else
				return playerdao.deletePlayer(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	public List<Player> searchAllPlayer() throws Exception {
		// TODO Auto-generated method stub
		try {
			return playerdao.getAllPlayer();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_user_'+#id")
	public Player IDfindPlayer(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			return playerdao.findPlayer(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	@Transactional
	public int maxID() throws Exception {
		// TODO Auto-generated method stub
		try {
			return playerdao.getMaxPlayerID();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
}
