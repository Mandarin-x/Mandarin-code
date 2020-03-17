package com.entity;

public class Book {
	private String book_id;
	private String book_name;
	private String book_author;
	private String book_type;
	private float book_price;
	private int book_state;
	private String book_shelf;
	private String book_rack;
	private String book_floor;
	private int book_borrow_num;
	
	/**
	 * book_id get&set
	 */
	public String getID(){
		return book_id;
	}
	
	public void setID(String id){
		book_id = id;
	}
	
	/**
	 * book_name get&set
	 */
	public String getName(){
		return book_name;
	}
	
	public void setName(String name){
		book_name = name;
	}
	
	/**
	 * book_author get&set
	 */
	public String getAuthor(){
		return book_author;
	}
	
	public void setAuthor(String author){
		book_author = author;
	}
	
	/**
	 * book_type get&set
	 */
	public String getType(){
		return book_type;
	}
	
	public void setType(String type){
		book_type = type;
	}
	
	
	/**
	 * book_price get&set
	 */
	public float getPrice(){
		return book_price;
	}
	
	public void setPrice(float price){
		book_price = price;
	}
	
	/**
	 * book_state get&set
	 */
	public int getState(){
		return book_state;
	}
	
	public void setState(int state){
		book_state = state;
	}
	
	
	/**
	 * book_shelf get&set
	 */
	public String getShelf(){
		return book_shelf;
	}
	
	public void setShelf(String shelf){
		book_shelf = shelf;
	}
	
	/**
	 * book_rack get&set
	 */
	public String getRack(){
		return book_rack;
	}
	
	public void setRack(String rack){
		book_rack = rack;
	}
	
	
	/**
	 * book_floor get&set
	 */
	public String getFloor(){
		return book_floor;
	}
	
	public void setFloor(String floor){
		book_floor = floor;
	}
	
	/**
	 * book_borrow_num get&set
	 */
	public int getBorrowNum(){
		return book_borrow_num;
	}
	
	public void setBorrowNum(int borrownum){
		book_borrow_num = borrownum;
	}
}
