package com.qa.book.entity;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity

//@Table(name = "Authors")
//@SecondaryTable(name = "Authors", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Multiple Authors"))
public class Author {


	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  long id;
	
	  
	  @Column(unique = true, nullable = false)
	    private String fullname;

	    @Column (nullable = false)
	    private String dob;

	    @Column
	    private String gender;

	    @Column
	    private String coo;

	    
	    
	    @JsonIgnore
		@ManyToMany (mappedBy = "authors")
	    Set<Book> Books;

	  public Author() {
		super();
		
	}






	public Author(long id, String fullname, String dob, String gender, String coo, Set<Book> books) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.dob = dob;
		this.gender = gender;
		this.coo = coo;
		Books = books;
	}






	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCoo() {
		return coo;
	}



	public void setCoo(String coo) {
		this.coo = coo;
	}




	

	
	
	
	
	
	
	
}
