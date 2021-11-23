package com.example.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.Entity.Parameter;


@Repository
@Mapper
public interface ParameterDAO {
	public List<Parameter> findAllParameter();
}
