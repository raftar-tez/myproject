package com.mycompany.bookstoreapp.service.impl;

import com.mycompany.bookstoreapp.converter.BookConverter;
import com.mycompany.bookstoreapp.dto.BookDTO;
import com.mycompany.bookstoreapp.entity.BookEntity;
import com.mycompany.bookstoreapp.repository.BookRepository;
import com.mycompany.bookstoreapp.repository.impl.BookRepositoryimpl;
import com.mycompany.bookstoreapp.service.BookService;

public class BookServiceImpl implements BookService {
private BookRepository bookRepository;
public BookServiceImpl() {
	this.bookRepository = new BookRepositoryimpl();
	
}
	@Override
	public Long add(BookDTO bookDTO) {
		// conveert the dto to repostory cpmpstale enity class thiss is called adater desin pattern
		BookEntity bookEntity=BookConverter.convertBookDTOtoBookEntity(bookDTO);
		return this.bookRepository.add( bookEntity);
	}

}
