package com.vignesh.problem.type;

import com.vignesh.problem.model.Book;

public class Biography extends BookType {
    @Override
    public void loadBooks() {
        //Hit the database software and get fiction books
        for(int i=1; i<=5; i++) {
            Book book = new Book();
            book.setBookId(i+600);
            book.setBookName(Integer.toString(6000+i));
            book.setBookStatus("Available");
            book.setBookPrice(35.0f);
            getBookList().add(book);
        }
        setType("Biography");
    }
}
