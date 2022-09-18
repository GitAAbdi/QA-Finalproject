//package co.qa.controllers;
//
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
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.book.entity.Author;
//import com.qa.book.repo.AuthorRepo;
//
//
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//
//@AutoConfigureMockMvc
//@Transactional
//
//public class AuthorControllerTest {
//
//@Autowired
//private MockMvc mockMvc;
//
//@Autowired
//private ObjectMapper objectMapper;
//
//@MockBean
//private AuthorRepo repo;
//
//private List<Author> authorsInDb = new ArrayList<>();
//private Author testAuthor;
//private long testAuthorId;
//private Author expectedTestauthor;
//private Author authorUpdateInfo;
//
//
//
//
//
//
//@BeforeEach
//public void init() {
//List<Author> Authors = List.of(
//new Author(1, "Barry", "12/08", "male", "Australia", null),
//new Author(2, "Barry", "12/08", "male", "Australia", null));
//authorsInDb.addAll(repo.saveAll(Authors));
//testAuthor = new Author(3, "Barry", "12/08", "male", "Australia", null);
//testAuthorId = testAuthor.getId();
//expectedTestauthor = new Author(testAuthor.getId(), testAuthor.getFullname(), testAuthor.getDob(),testAuthor.getGender(),testAuthor.getCoo(), null);
//authorUpdateInfo = new Author(1, "Allen", "12/08", "male", "Australia", null);
//
//}
//
//
//@Test
//public void getauthorsTest() throws Exception {
//// mock http request builder
//MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.GET, "/authors/getAll");
//// specifying accept header return type
//mockRequest.accept(MediaType.APPLICATION_JSON);
//// JSON string for obj mapper
//String authors = objectMapper.writeValueAsString(authorsInDb);
//// result matcher
//ResultMatcher statusMatcher = MockMvcResultMatchers.status().isOk();
//ResultMatcher contentMatcher = MockMvcResultMatchers.content().json(authors);
//// request and assert
//mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//}
//
//@Test
//public void deleteByIsbn() throws Exception {
//MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.DELETE,
//"/authors/" + authorUpdateInfo.getId());
//ResultMatcher statusMatcher = MockMvcResultMatchers.status().isAccepted();}
//
////@Test
////public void getByIsbnTest() throws Exception {
////authorsDb.add(repository.save(testAuthor));
////MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.GET,
////"/authors/" + testAuthorId);
////specifying accept header return type
//// mockRequest.accept(MediaType.APPLICATION_JSON);
////JSON string for obj mapper
//// String testauthorStr = objectMapper.writeValueAsString(testAuthor);
//// result matcher
//// ResultMatcher statusMatcher = MockMvcResultMatchers.status().isOk();
//// ResultMatcher contentMatcher = MockMvcResultMatchers.content().json(testauthorStr);
//// request and assert
//// mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//// }
//
// @Test
// public void createauthorTest() throws Exception {
// // test object
// Author expectedTestauthor = new Author(testAuthor.getId(), testAuthor.getFullname(), testAuthor.getDob(),testAuthor.getGender(),testAuthor.getCoo(), null);
// // mock request
// MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/authors/create");
// // specifying accept header return type
// mockRequest.contentType(MediaType.APPLICATION_JSON);
// mockRequest.content(objectMapper.writeValueAsString(testAuthor));
//
// mockRequest.accept(MediaType.APPLICATION_JSON);
// ResultMatcher statusMatcher = MockMvcResultMatchers.status().isCreated();
// ResultMatcher contentMatcher = MockMvcResultMatchers.content()
// .json(objectMapper.writeValueAsString(expectedTestauthor));
//
// mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//
// }
//
//// @Test
//// public void updateauthorTest() throws Exception {
//// MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders.request(HttpMethod.PUT,
//// "/authors/update" + authorUpdateInfo.getId());
//// // specifying accept header return type
//// mockRequest.contentType(MediaType.APPLICATION_JSON);
//// mockRequest.content(objectMapper.writeValueAsString(authorUpdateInfo));
//// mockRequest.accept(MediaType.APPLICATION_JSON);
//// ResultMatcher statusMatcher = MockMvcResultMatchers.status().isAccepted();
//// ResultMatcher contentMatcher = MockMvcResultMatchers.content()
//// .json(objectMapper.writeValueAsString(authorUpdateInfo));
////
//// mockMvc.perform(mockRequest).andExpect(statusMatcher).andExpect(contentMatcher);
//// }
//
//
//
//
//
//}
