package com.example.Entity;

import java.io.Serializable;

public class Formula implements Serializable{
	private static final long serialVersionUID =7760614561073458250L;
	private int id;
	private String formula;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
}
