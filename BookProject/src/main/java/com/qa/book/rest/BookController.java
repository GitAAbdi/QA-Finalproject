package com.qa.book.rest;




import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.book.entity.Book;
import com.qa.book.services.BookService;





@RestController	
public class BookController {
	
	  private BookService service;

	    public BookController(BookService service) 
	    
	    {
	        super();
	        this.service = service;
	    }

//private List<Books> Bookss = new ArrayList<>();

//crud starts

//    @GetMapping("/test")
//    public String test() {
//        return "Hello, World! from Books";
//    } 	
    
    
    
    // Create
    @PostMapping("/book/create")
    public Book addBook(@RequestBody Book Book) {
        return this.service.addBook(Book);
    }
    
    

    
    @GetMapping("/book/getAll")
    public List<Book> getAllBooks() {
        return this.service.getAllBooks();
    }
    
    
    //update
    @PutMapping("/book/update")
    public Book updateBooks(@PathParam("id") Long id, @RequestBody Book Book) {
        return this.service.updateBooks(id, Book);
    }

    
    
  //delete
    @DeleteMapping("/book/delete/{id}")
    public boolean removeBooks(@PathVariable Long id) {
        return this.service.removeBooks(id);
    }
}
