package com.qa.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.book.entity.Author;




@Repository
public interface AuthorRepo extends JpaRepository<Author, Long>{
	


}
