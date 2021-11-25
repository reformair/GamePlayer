package com.example.service;

import java.util.Map;

public interface MapService {
	public String IDfindMap(String MapID) throws Exception;
	public Map<String,String> findAllMap() throws Exception;
	public boolean insertMap(String MapID,String MapName) throws Exception;
	public boolean deleteMap(String MapID) throws Exception;
}
