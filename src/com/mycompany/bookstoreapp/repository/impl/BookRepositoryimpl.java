package com.mycompany.bookstoreapp.repository.impl;



import com.mycompany.bookstoreapp.entity.BookEntity;
import com.mycompany.bookstoreapp.repository.BookRepository;
import com.mycompany.bookstoreapp.serdesr.BookSerializer;

public class BookRepositoryimpl  implements BookRepository{



	@Override
	public Long add(BookEntity bookEntity) {
		
		BookSerializer.serializeBook(bookEntity);
		return bookEntity.getBookId();
	}

}
