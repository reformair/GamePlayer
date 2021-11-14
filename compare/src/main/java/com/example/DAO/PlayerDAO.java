package com.example.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.Entity.Player;

@Repository
@Mapper
public interface PlayerDAO {
 public Player getPlayer(int ID);
 public int insertPlayer(Player player);
 public int deletePlayer(int ID);
}
