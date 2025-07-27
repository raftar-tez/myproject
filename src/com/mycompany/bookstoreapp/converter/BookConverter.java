package com.mycompany.bookstoreapp.converter;

import com.mycompany.bookstoreapp.dto.BookDTO;
import com.mycompany.bookstoreapp.entity.BookEntity;

public class BookConverter {
public static BookEntity convertBookDTOtoBookEntity(BookDTO bookDTO) {
	BookEntity be  =new BookEntity();
	be.setAuthorEmail(bookDTO.getAuthorEmail());
	be.setAuthorName(bookDTO.getAuthorName());
	be.setAvailableQty(bookDTO.getAvailableQty());
	be.setBookId(bookDTO.getBookId());
	be.setDescription(bookDTO.getDescription());
	be.setName(bookDTO.getName());
	be.setPriceperQty(bookDTO.getPriceperQty());
	
	return be;
	
	
}
}
