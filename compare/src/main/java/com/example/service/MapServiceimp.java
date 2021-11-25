package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class MapServiceimp implements MapService{

	@Autowired
	private RedisTemplate redisTemplate = null;
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Override
	public String IDfindMap(String MapID) throws Exception {
		// TODO Auto-generated method stub
		try {
			return (String) redisTemplate.opsForValue().get(MapID);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean insertMap(String MapID, String MapName) throws Exception {
		// TODO Auto-generated method stub
		try {
			redisTemplate.opsForValue().set(MapID, MapName);
			return true;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean deleteMap(String MapID) throws Exception {
		// TODO Auto-generated method stub
		try {
			redisTemplate.delete(MapID);
			return true;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public Map<String,String> findAllMap() throws Exception {
		// TODO Auto-generated method stub
		Map<String,String> vals = new HashMap<>();
		try {
			Set<String> keys = stringRedisTemplate.keys("M*");
	        if (keys == null) {
	            return null;
	        } else {
	            for (String k : keys) {
	            	vals.put(k, (String)stringRedisTemplate.opsForValue().get(k));
	            }
	            return vals;
	        }
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

}
