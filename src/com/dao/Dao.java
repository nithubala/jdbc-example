package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connectionutil.ConnectionUtil;
import com.model.Model;

public class Dao {
public static final Connection con=ConnectionUtil.getConnection();
	
	public void insert(Model model) throws Exception {
		String query="INSERT INTO model (isbn,title,author,publishDate,content,price,status) VALUES (???????)";
	try
	{
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1,model.getIsbn() );
		ps.setString(2,model.getTitle());
		ps.setString(3,model.getAuthor());
		ps.setLong(4,model.getPublishdate());
		ps.setString(5,model.getContent());
		ps.setInt(6,model.getPrice());
		ps.setString(7,model.getStatus());
		ps.execute();
		System.out.println("inserted");
	}
	catch(SQLException se)
	{
	se.printStackTrace();	
	}
	}
	public void update(Model model)
	{
		String query="update author set content = ?  where isbn=?";
		 
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,model.getContent());
			ps.setInt(2,model.getIsbn());
			ps.executeUpdate();
			System.out.println("update");
		}
	catch(SQLException e){
		e.printStackTrace();
	}
	}
	public void select(Model model )
	{
		String query="SELECT title,content FROM model";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.execute();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	
	}
}

