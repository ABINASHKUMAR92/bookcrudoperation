package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Bookmodel;
import com.example.demo.service.Bookservice;



@RestController
public class Bookcontroller {
	@Autowired Bookservice bookservice;
	@RequestMapping(value="/getAllBooks",method=RequestMethod.GET)
public List<Bookmodel>getallBooks(){
		return bookservice.getAllBooks();
		
	}
	@RequestMapping(value="/getOne/{id}",method=RequestMethod.GET)    
    public Optional<Bookmodel> getByOne(@PathVariable int id){    
        Optional<Bookmodel> bm=bookservice.getbookById(id);    
        //m.addAttribute("command",bm);  
        return bm;    
    }
	@RequestMapping(value="/del/{bookid}",method=RequestMethod.DELETE)  
 	public int deleteBook(@PathVariable(name="bookid") int bookid)  {  
	return bookservice.delete(bookid) ; 
	}  

       @RequestMapping(value="/update/{bookid}",method=RequestMethod.PUT) 
	public String update(@RequestBody Bookmodel bm,@PathVariable int bookid)
	{  
 	  return bookservice.upDate(bm,bookid)+"Added";


}
}
  