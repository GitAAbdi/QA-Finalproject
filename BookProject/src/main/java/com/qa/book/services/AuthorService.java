package com.qa.book.services;


import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.qa.book.entity.Author;
import com.qa.book.repo.AuthorRepo;



	@Service
	public class AuthorService {
	
	    //private List<Author> Authors = new ArrayList<>();
		
		
		private AuthorRepo repo;
	
	    public AuthorService(AuthorRepo repo) {
	        super();
	        this.repo = repo;
	    }
		
		
	    //create 
	    public Author addAuthor(Author Author) {
	        return this.repo.save(Author);
	    }
	
	    
	    //read   
	    public List<Author> getAllAuthors() {
	        return this.repo.findAll();
	    }
	    
	    
	    //update
	    public Author updateAuthor(Long id, Author newAuthor) {
	        Optional<Author> existingOptional = this.repo.findById(id);
	        Author existing = existingOptional.get();
	
	        existing.setFullname(newAuthor.getFullname());
	        existing.setDob(newAuthor.getDob());
	        existing.setGender(newAuthor.getGender());
	        existing.setCoo(newAuthor.getCoo());
	        
	        
	        return this.repo.save(existing);
	        
	    }
	
	    
	    
	    //delete
	    public boolean removeAuthor(Long id) {
	    	
	    	// removes the entity
	        this.repo.deleteById(id);
	
	        // checks to see if it still exists
	        boolean exists = this.repo.existsById(id);
	        
	        // returns true if entity no longer exists
	        return !exists;
	        
	    }
	
	}