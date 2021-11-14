package com.example.service;

import com.example.Entity.Result;

public interface ResultService {
	public Result searchResult(String map,int times);
	public void insertResult(Result result);
	public void deleteResult(String map,int times);
}
