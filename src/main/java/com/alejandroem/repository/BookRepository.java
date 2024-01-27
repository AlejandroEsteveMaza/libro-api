package com.alejandroem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejandroem.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {


	Book save(Book book);
	
	List<Book> findByTitle(String title);

	List<Book> findByAuthor(String author);
	
	List<Book> findAll();
	
	Book findById(long id);

	void delete(Book book);
	
	void deleteById(long id);
}
