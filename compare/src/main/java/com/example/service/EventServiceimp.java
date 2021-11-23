package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventServiceimp implements EventService{

	@Autowired
	private RedisTemplate redisTemplate = null;
	
	
	@Override
	public Object IDfindEvent(String MapID, int distance) throws Exception {
		// TODO Auto-generated method stub
		String key = new String(MapID + distance);
		try {
			return redisTemplate.opsForValue().get(key);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean insertEvent(String MapID, int distance, Object Event) throws Exception {
		// TODO Auto-generated method stub
		String key = new String(MapID + distance);
		try {
			redisTemplate.opsForValue().set(key, Event);
			return true;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public boolean deleteEvent(String MapID, int distance) throws Exception {
		// TODO Auto-generated method stub
		String key = new String(MapID + distance);
		try {
			redisTemplate.delete(key);
			return true;
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

}
