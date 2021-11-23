package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ParameterDAO;
import com.example.Entity.Parameter;

@Service
public class ParameterServiceimp implements ParameterService{
	
	@Autowired
	private ParameterDAO parameterdao;
	
	@Override
	public List<Parameter> searchAllParameter() throws Exception {
		// TODO Auto-generated method stub
		try {
			return parameterdao.findAllParameter();
		} catch(Exception e) {
			throw new Exception(e);
		}
	}
}
