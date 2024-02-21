package com.citibank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.citibank.model.Book;

@RestController
@RequestMapping(value="/books")
public class BooksController {
	
	@Autowired
	RestTemplate restTemplate;
	
	  @GetMapping("/all") public ResponseEntity<List<Book>> getAll(){ List<Book>
	  books = new ArrayList<>(); books.add(new
	  Book(1,"Spring Rest in Action","John Carnell",2525.00)); books.add(new
	  Book(2,"Learning Spring Rest","George",3525.00)); return
	  ResponseEntity.ok().body(books); }
	 
	
		
	@GetMapping(value="/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id){
		return ResponseEntity.ok().body(new Book(1,"Spring Rest in Action","John Carnell",2525.00));
	}
	
	
	  @GetMapping("/boodByUrl") public ResponseEntity<?> getRest(){
		  Book book =
	  restTemplate.
	  getForObject("http://localhost:8080/books/book/1?mediaType=json"
	  ,Book.class); 
		  return ResponseEntity.ok().body(book); 
	}
	 

}
