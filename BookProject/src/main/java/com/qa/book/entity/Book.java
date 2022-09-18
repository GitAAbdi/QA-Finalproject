package com.qa.book.entity;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.qa.book.entity.Author;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Books")
public class Book {
	  
		@ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    Set<Author> authors;
		
	    @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private  long id;
		
		  
		  	@Column(unique = true, nullable = false)
		    private String title;

		    @Column (nullable = false)
		    private String isbn;

		    @Column
		    private String year;

		    @Column
		    private String cost;
		    
		    @Column
		    private String publisher;
		    
		    public Book() {
				super();
				
			}

		
			public Book(Set<Author> authors, long id, String title, String isbn, String year, String cost,
					String publisher) {
				super();
				this.authors = authors;
				this.id = id;
				this.title = title;
				this.isbn = isbn;
				this.year = year;
				this.cost = cost;
				this.publisher = publisher;
			}


			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getIsbn() {
				return isbn;
			}

			public void setIsbn(String isbn) {
				this.isbn = isbn;
			}

			public String getYear() {
				return year;
			}

			public void setYear(String year) {
				this.year = year;
			}

			public String getCost() {
				return cost;
			}

			public void setCost(String cost) {
				this.cost = cost;
			}

			public String getPublisher() {
				return publisher;
			}

			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}


			public Set<Author> getAuthors() {
				return authors;
			}


			public void setAuthors(Set<Author> authors) {
				this.authors = authors;
			}
		    
		    
	  
	  
}
