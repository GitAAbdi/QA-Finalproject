package com.qa.book.services;



import java.util.List;
import java.util.Optional;

import javax.persistence.Column;

import org.springframework.stereotype.Service;

import com.qa.book.entity.Book;
import com.qa.book.repo.BookRepo;



@Service
public class BookService {
	
	private BookRepo repo;

    public BookService(BookRepo repo) {
        super();
        this.repo = repo;
    }
	
	
    //create 
    public Book addBook(Book Book) {
        return this.repo.save(Book);
    }

    
    //read   
    public List<Book> getAllBooks() {
        return this.repo.findAll();
    }
    
    
    //update
    public Book updateBooks(Long id, Book newBook) {
        Optional<Book> existingOptional = this.repo.findById(id);
        Book existing = existingOptional.get();

        existing.setTitle(newBook.getTitle());
        existing.setIsbn(newBook.getIsbn());
        existing.setYear(newBook.getYear());
        existing.setCost(newBook.getCost());
        existing.setPublisher(newBook.getPublisher());
        
        
        return this.repo.save(existing);
        
    }

    
    
    //delete
    public boolean removeBooks(Long id) {
    	
    	// removes the entity
        this.repo.deleteById(id);

        // checks to see if it still exists
        boolean exists = this.repo.existsById(id);
        
        // returns true if entity no longer exists
        return !exists;
        
    }

}
