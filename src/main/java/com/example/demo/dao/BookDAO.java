package com.example.demo.dao;

import java.util.List;
 import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bookmodel;

@Repository
public class BookDAO {
 
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Bookmodel>getAll() {
		List<Bookmodel> li=jdbcTemplate.query("select * from books",
				(result,rowNum)->new Bookmodel(
		result.getInt("bookid"),result.getString("bookName"),result.getString("bookAuthor"),
		 	result.getInt("bookprice")));
				return li;
	}
	public Optional<Bookmodel> getbookById(int id){ 
		return jdbcTemplate.queryForObject("select * from books where bookid = ?", new Object[] {id},
				(rs, rowNum)->
		Optional.of(new Bookmodel(rs.getInt("bookid"),rs.getString("bookname"),
				rs.getString("bookauthor"),rs.getInt("bookprice"))));	    
	}
	public int delete(int bookid){    
	    String sql="delete from books where bookid=?";    
	    return jdbcTemplate.update(sql,bookid);    
	}
	public int update(Bookmodel bm,int bookid) {
	String s="update books set bookname=?,bookauthor=?,bookprice=? where bookid=?"	;
	
		return jdbcTemplate .update(s,new Object[] {bm.getBookname(),bm.getBookauthor(),bm.getBookprice(),bookid});
	}    
}
          