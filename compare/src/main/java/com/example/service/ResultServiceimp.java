package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ResultDAO;
import com.example.Entity.Result;

@Service
public class ResultServiceimp implements ResultService {

	@Autowired
	private ResultDAO resultdao;
	
	@Override
	public Result searchResult(String map,int times) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setMap(map);
		result.setTimes(times);
		return resultdao.getResult(result);
	}

	@Override
	public void insertResult(Result result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteResult(String map,int times) {
		// TODO Auto-generated method stub
		
	}

}
