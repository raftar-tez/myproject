package com.mycompany.bookstoreapp.serdesr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.mycompany.bookstoreapp.entity.BookEntity;

public class BookSerializer {
public static void serializeBook(BookEntity bookEntity) {
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	
	try {
		 fos =new FileOutputStream(bookEntity.getBookId()+".ser");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(bookEntity);
	}catch(IOException ex) {
		ex.printStackTrace();
		
	}
	finally {
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
