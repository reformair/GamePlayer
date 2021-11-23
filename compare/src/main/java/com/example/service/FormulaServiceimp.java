package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.DAO.FormulaDAO;
import com.example.Entity.Formula;

@Service
public class FormulaServiceimp implements FormulaService{

	@Autowired
	private FormulaDAO formuladao;
	
	@Override
	@Transactional
	@Cacheable(value = "redisCache",key = "'redis_formula_'+#id")
	public String IDfindFormula(int id) throws Exception {
		// TODO Auto-generated method stub
		try {
			return formuladao.findFormula(id);
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Formula> searchAllFormula() throws Exception {
		// TODO Auto-generated method stub
		try {
			return formuladao.findAllFormula();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}

}
