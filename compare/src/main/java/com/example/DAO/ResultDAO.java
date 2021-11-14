package com.example.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.Entity.Result;

@Repository
@Mapper
public interface ResultDAO {
	public Result getResult(Result result);
	public void insertResult(Result result);
	public int deleteResult(Result result);
}
