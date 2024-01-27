package com.alejandroem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandroem.entity.Book;
import com.alejandroem.exception.BookNotFoundException;
import com.alejandroem.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book getBookById(Long id){
		return bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException("Libro no encontrado: " + id));
	}
	
	public List<Book> getBookByTitle(String title){
		return bookRepository.findByTitle(title);
	}
	
	public List<Book> getBookByAuthor(String author){
		return bookRepository.findByAuthor(author);
	}
	
	public Book addBook(Book book){
		return bookRepository.save(book);
	}
	
	public void deleteBookById(long id){
		bookRepository.deleteById(id);
	}
	
	public void deleteBook(Book book){
		bookRepository.delete(book);
	}
	
	
	

}
