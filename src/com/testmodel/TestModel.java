package com.testmodel;

import com.dao.Dao;
import com.model.Model;

public class TestModel {
public static void main(String[]args) throws Exception
{
	Model model=new Model();
	Dao dao=new Dao();
	
	model.setIsbn(10);
	model.setContent("communication");
	model.setAuthor("rekha");
	model.setPrice(500);
	model.setStatus("published");
	model.setTitle("CT");
	model.setPublishdate(10122000);
	
	dao.insert(model);
	dao.update(model);
	dao.select(model);
}

}
