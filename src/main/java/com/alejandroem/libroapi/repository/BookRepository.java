package com.alejandroem.libroapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejandroem.libroapi.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	/*
	List<Book> findByTitle(String title);
	
	List<Book> findByAuthor(String author);
*/
	/*
	 * Book save(Book book);
	 * 
	 * List<Book> findByTitle(String title);
	 * 
	 * List<Book> findByAuthor(String author);
	 * 
	 * List<Book> findAll();
	 * 
	 * Book findById(long id);
	 * 
	 * void delete(long id);
	 * 
	 * void update(Book book);
	 */

}
