//package co.qa.controllers;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.book.entity.Book;
//import com.qa.book.repo.BookRepo;
//import com.qa.book.rest.BookController;
//
//
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//
//@ContextConfiguration(classes = BookController.class)
//
//@AutoConfigureMockMvc
//@Transactional
//
//public class BookControllerTest {
//
//@Autowired
//private MockMvc mockMvc;
//
//@Autowired
//private ObjectMapper objectMapper;
//
//@MockBean
//private BookRepo repo;
//
//private List<Book> BooksInDb = new ArrayList<>();
//private Book testBook;
//private long testBookId;
//private Book expectedTestBook;
//private Book BookUpdateInfo;
//
//
//
//
//
//
//@BeforeEach
//public void init() {
//List<Book> Books = List.of(
//new Book(null, 1, "Barry", "12/08", "male", "Australia", null),
//new Book(null, 2, "Allen", "12/08", "male", "Australia", null));
//BooksInDb.addAll(repo.saveAll(Books));
//testBook = new Book(null, 3, "Barry", "12/08", "male", "Australia", null);
//testBookId = testBook.getId();
//expectedTestBook = new Book(null, testBook.getId(), testBook.getTitle(), testBook.getIsbn(), testBook.getYear(), testBook.getCost(), testBook.getPublisher());
//BookUpdateInfo = new Book(null, 2, "Harry Ptter", "123-45634-2135-62", "12/08/2022", "35.67", "com");
//
//}
//
//
//@Test
//public void getBooksTest() throws Exception {
//// mock http request builder
//MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.GET, "/Books/getAll");
//// specifying accept header return type
//mockRequest.accept(MediaType.APPLICATION_JSON);
//// JSON string for obj mapper
//String Books = objectMapper.writeValueAsString(BooksInDb);
//// result matcher
//ResultMatcher statusMatcher = MockMvcResultMatchers.status().isOk();
//ResultMatcher contentMatcher = MockMvcResultMatchers.content().json(Books);
//// request and assert
//mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//}
//
//@Test
//public void deleteByIsbn() throws Exception {
//MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.DELETE,
//"/Books/" + BookUpdateInfo.getId());
//ResultMatcher statusMatcher = MockMvcResultMatchers.status().isAccepted();}
//
//
//
// @Test
// public void createBookTest() throws Exception {
// // test object
// Book expectedTestBook = new Book(null, testBook.getId(), testBook.getTitle(), testBook.getIsbn(), testBook.getYear(), testBook.getCost(), testBook.getPublisher());
// // mock request
// MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/Books/create");
// // specifying accept header return type
// mockRequest.contentType(MediaType.APPLICATION_JSON);
// mockRequest.content(objectMapper.writeValueAsString(testBook));
//
// mockRequest.accept(MediaType.APPLICATION_JSON);
// ResultMatcher statusMatcher = MockMvcResultMatchers.status().isCreated();
// ResultMatcher contentMatcher = MockMvcResultMatchers.content()
// .json(objectMapper.writeValueAsString(expectedTestBook));
//
// mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//
// }
//
//// @Test
//// public void updateBookTest() throws Exception {
//// MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.PUT,
//// "/Books/update" + BookUpdateInfo.getId());
//// // specifying accept header return type
//// mockRequest.contentType(MediaType.APPLICATION_JSON);
//// mockRequest.content(objectMapper.writeValueAsString(BookUpdateInfo));
//// mockRequest.accept(MediaType.APPLICATION_JSON);
//// ResultMatcher statusMatcher = MockMvcResultMatchers.status().isAccepted();
//// ResultMatcher contentMatcher = MockMvcResultMatchers.content()
//// .json(objectMapper.writeValueAsString(BookUpdateInfo));
////
//// mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//// }
//
//
//
//
//
//}