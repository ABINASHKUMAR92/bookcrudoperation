package com.example.demo.service;


  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDAO;
import com.example.demo.model.Bookmodel;

@Service
public class Bookservice {
	@Autowired
	BookDAO bookdao;
	public List<Bookmodel>getAllBooks(){
		return bookdao.getAll();
}
	
public Optional<Bookmodel> getbookById(int id) {
	return bookdao.getbookById(id);
}

public int delete(int bookid)   {  
	return bookdao.delete(bookid);  
}  

public int upDate(Bookmodel bm, int bookid) {
	
	return bookdao.update(bm,bookid);
}  
} 

    