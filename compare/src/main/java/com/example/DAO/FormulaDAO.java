package com.example.DAO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.Entity.Formula;


@Repository
@Mapper
public interface FormulaDAO {
	public String findFormula(int id);
	public List<Formula> findAllFormula();
}
