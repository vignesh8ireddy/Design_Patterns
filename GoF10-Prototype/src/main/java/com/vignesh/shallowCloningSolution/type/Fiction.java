package com.vignesh.shallowCloningSolution.type;

import com.vignesh.shallowCloningSolution.model.Book;

public class Fiction extends BookType {
    @Override
    public void loadBooks() {
        //Hit the database software and get fiction books
        for(int i=1; i<=5; i++) {
            Book book = new Book();
            book.setBookId(i+100);
            book.setBookName(Integer.toString(1000+i));
            book.setBookStatus("Available");
            book.setBookPrice(45.0f);
            getBookList().add(book);
        }
        setType("fiction");
    }
}
