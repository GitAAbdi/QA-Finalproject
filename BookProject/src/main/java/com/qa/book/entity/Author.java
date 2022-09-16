package com.qa.book.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity

//@Table(name = "Books")
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

	   

	  public Author() {
		super();
		
	}



	public Author(long id, String fullname, String dob, String gender, String coo) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.dob = dob;
		this.gender = gender;
		this.coo = coo;
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
