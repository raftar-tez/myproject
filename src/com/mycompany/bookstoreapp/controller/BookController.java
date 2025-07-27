package com.mycompany.bookstoreapp.controller;

import com.mycompany.bookstoreapp.dto.BookDTO;
import com.mycompany.bookstoreapp.service.BookService;
import com.mycompany.bookstoreapp.service.impl.BookServiceImpl;

public class BookController {
	
	private BookService bookService;
	public BookController() {
		// runtime plymorphisnm
		this.bookService = new BookServiceImpl();
		 
	}
public Long add(BookDTO bookDTO) {
		// call to the serviice layer add metgod
	 return this.bookService.add(bookDTO);
		
		
	}
}
