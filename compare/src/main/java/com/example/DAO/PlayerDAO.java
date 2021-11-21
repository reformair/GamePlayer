package com.example.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.Entity.Player;

@Repository
@Mapper
public interface PlayerDAO {
 public Player findPlayer(int id);
 public List<Player> getPlayer(List<Integer> IDList);
 public List<Player> getAllPlayer();
 public int insertPlayer(Player player);
 public int deletePlayer(int id);
 public int getMaxPlayerID();
}
