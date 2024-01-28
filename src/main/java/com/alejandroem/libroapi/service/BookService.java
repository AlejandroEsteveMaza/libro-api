package com.alejandroem.libroapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandroem.libroapi.entity.Book;
import com.alejandroem.libroapi.exception.BookNotFoundException;
import com.alejandroem.libroapi.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAllBooks() {
		return this.bookRepository.findAll();
	}

	public Book addBook(Book book) {
		return this.bookRepository.save(book);
	}

	

	/* 
	 * public List<Book> getAllBooks(){ return bookRepository.findAll(); }
	 * 
	 * public Book getBookById(Long id){ return
	 * bookRepository.findById(id).orElseThrow(()-> new
	 * BookNotFoundException("Libro no encontrado: " + id)); }
	 * 
	 * public List<Book> getBookByTitle(String title){ return
	 * bookRepository.findByTitle(title); }
	 * 
	 * public List<Book> getBookByAuthor(String author){ return
	 * bookRepository.findByAuthor(author); }
	 * 
	 * public Book addBook(Book book){ return bookRepository.save(book); }
	 * 
	 * public void deleteBook(long id){ bookRepository.delete(id); }
	 * 
	 * public void updateBook(Book book){ bookRepository.update(book); }
	 */

}
