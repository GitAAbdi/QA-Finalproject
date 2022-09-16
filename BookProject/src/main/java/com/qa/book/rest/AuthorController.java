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

import com.qa.book.entity.Author;
import com.qa.book.services.AuthorService;





@RestController	
public class AuthorController {
	
	  private AuthorService service;

	    public AuthorController(AuthorService service) 
	    
	    {
	        super();
	        this.service = service;
	    }

//private List<Author> Authors = new ArrayList<>();

//crud starts

   
    
    
    // Create
    @PostMapping("/author/create")
    public Author addAuthor(@RequestBody Author Author) {
        return this.service.addAuthor(Author);
    }
    
    

    
    @GetMapping("/author/getAll")
    public List<Author> getAllAuthors() {
        return this.service.getAllAuthors();
    }
    
    
    //update
    @PutMapping("/author/update")
    public Author updateAuthor(@PathParam("id") Long id, @RequestBody Author Author) {
        return this.service.updateAuthor(id, Author);
    }

    
    
  //delete
    @DeleteMapping("/author/delete/{id}")
    public boolean removeAuthor(@PathVariable Long id) {
        return this.service.removeAuthor(id);
    }
}
