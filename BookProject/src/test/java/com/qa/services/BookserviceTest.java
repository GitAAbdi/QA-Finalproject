package com.qa.services;




import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.qa.book.entity.Author;
import com.qa.book.services.BookService;
import com.qa.book.entity.Book;
import com.qa.book.repo.BookRepo;

@SpringBootTest (classes = BookService.class)
@ActiveProfiles("test")
public class BookserviceTest {

@Autowired 

private BookService service;

@MockBean


private BookRepo repo;

//"authors"
//"Authors"
//Set<Author> authors

@Test
void testGetById() {
final Long Id = (long) 1;
final Optional<Book> Book = Optional.ofNullable(new Book(null, Id, "Harry Potter", "123-45634-2135-62", "12/08/2022", "35.67", "com"));

Mockito.when(this.repo.findById(Id)).thenReturn(Book);

assertThat(this.service.findById(Id)).isEqualTo(Book);

Mockito.verify(this.repo, Mockito.times(1)).findById(Id);
}

@Test
void testGetAllBooks() {
final List<Book> Books = List.of(new Book(null, 2, "Harry Potter", "123-45634-2135-62", "12/08/2022", "35.67", "com"),
new Book(null, 2, "Harry Putter", "123-474-2135-656", "11/09/2022", "38.86", "coma"));

Mockito.when(this.repo.findAll()).thenReturn(Books);

assertThat(this.service.getAllBooks()).isEqualTo(Books);

Mockito.verify(this.repo, Mockito.times(1)).findAll();
}

//@Test
//void testUpdate() { // REMEMBER TO OVERRIDE THE equals() METHOD IN YOUR ENTITY
//final Long id = (long) 1;
//Book Book = new Book(null, id, "Harry Potter", "123-45634-2135-62", "12/08/2022", "35.67", "com");
//Optional<Book> optionalBook = Optional.of(Book);
//
//Book newBook = new Book (null, id, "Harry Potter", "123-45634-2135-62", "12/08/2022", "35.67", "com");
//
//Mockito.when(this.repo.findById(id)).thenReturn(optionalBook);
//Mockito.when(this.repo.save(newBook)).thenReturn(newBook);
//
//assertThat(this.service.updateBooks(Book.getId(),newBook)).isEqualTo(newBook);
//
//Mockito.verify(this.repo, Mockito.times(1)).findById(id);
//Mockito.verify(this.repo, Mockito.times(1)).save(newBook);
//}


@Test
void testDelete() {
final Long id = (long) 1;

Mockito.when(this.repo.existsById(id)).thenReturn(false);

assertThat(this.service.removeBooks(id)).isEqualTo(true);

Mockito.verify(this.repo, Mockito.times(1)).existsById(id);
}
}
