package com.vignesh.deepCloningSolution.type;

import com.vignesh.deepCloningSolution.model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class BookType implements Cloneable {
    private String type;
    private List<Book> bookList = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "type='" + type + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    public abstract void loadBooks();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
