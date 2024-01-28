package com.alejandroem.libroapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandroem.libroapi.entity.Book;
import com.alejandroem.libroapi.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping()
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}
	
	

	@PostMapping()
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	/*
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/1")
	public String test(){
		return "ASdasda";
	}
	
	@GetMapping("{/id}")
	public Book getBookById(@PathVariable Long id){
		return bookService.getBookById(id);
	}
	
	@GetMapping("{/title}")
	public List<Book> getBookByTitle(@PathVariable String title){
		return bookService.getBookByTitle(title);
	}
	
	@GetMapping("{/author}")
	public List<Book> getBookByAuthor(@PathVariable String author){
		return bookService.getBookByAuthor(author);
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	
	@PutMapping("{/id}")
	public void deleteBook(@PathVariable long id){
		bookService.deleteBook(id);
	}
	
	@PutMapping("{/id}")
	public void updateBook(@PathVariable long id,@RequestBody Book book){
		bookService.updateBook(book);
	}*/

}
