package com.example.service;

import java.util.List;

import com.example.Entity.Formula;

public interface FormulaService {
	public String IDfindFormula(int id) throws Exception;
	public List<Formula> searchAllFormula() throws Exception;
}
