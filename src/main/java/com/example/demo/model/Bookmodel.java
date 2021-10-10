package com.example.demo.model;

public class Bookmodel {
	private int bookid;
	private String bookname;
	private String bookauthor;
	private int bookprice;

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	
	public Bookmodel(int bookid, String bookname, String bookauthor, int bookprice) {
		
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}

	
	@Override
	public String toString() {
		return "Bookmodel [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookprice="
				+ bookprice + "]";
	}
	
}

