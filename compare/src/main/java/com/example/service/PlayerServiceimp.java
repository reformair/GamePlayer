package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.PlayerDAO;
import com.example.Entity.Player;

@Service
public class PlayerServiceimp implements PlayerService{

	@Autowired
	private PlayerDAO playerdao;
	
	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_user_'+#ID")
	public Player searchPlayer(int ID) {
		// TODO Auto-generated method stub
		Player ret = playerdao.getPlayer(ID);
		return ret;
	}

	@Override
	public void insertPlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlayer(int ID) {
		// TODO Auto-generated method stub
		
	}
	
}
