package com.workflow.dao;

import java.util.List;

import com.workflow.model.Request;

public interface RequestDAO {
	
	public boolean insert(Request request);
	public boolean delete(Request request);
	public boolean update(Request request);
	public List<Request> selectAll();
	public Request findRequestById(String id);
}
