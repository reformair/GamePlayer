package com.example.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.Entity.Game;

@Repository
@Mapper
public interface GameDAO {
	 public Game findGame(int id);
	 public List<Game> getGame(List<Integer> IDList);
	 public int insertGame(Game player);
	 public int deleteGame(int id);
	 public int getMaxGameID();
}
