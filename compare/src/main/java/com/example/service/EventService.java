package com.example.service;


public interface EventService {
	public Object IDfindEvent(String MapID,int distance) throws Exception;
	public boolean insertEvent(String MapID,int distance,Object Event) throws Exception;
	public boolean deleteEvent(String MapID,int distance) throws Exception;
}
