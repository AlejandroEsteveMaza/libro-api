package com.alejandroem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alejandroem.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

}
