package com.example.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.Entity.GameResult;

@Repository
@Mapper
public interface GameResultDAO {
	 public List<GameResult> getGameResult(int playerId);
	 public int insertGameResult(GameResult gameResult);
	 public int deleteGameResult(int id);
}
