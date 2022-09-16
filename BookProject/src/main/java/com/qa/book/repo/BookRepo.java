package com.qa.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.book.entity.Book;





@Repository
public interface BookRepo extends JpaRepository<Book, Long>{
	


}
