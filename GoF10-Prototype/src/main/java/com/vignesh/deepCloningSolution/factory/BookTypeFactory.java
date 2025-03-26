package com.vignesh.deepCloningSolution.factory;

import com.vignesh.deepCloningSolution.model.Book;
import com.vignesh.deepCloningSolution.type.Biography;
import com.vignesh.deepCloningSolution.type.BookType;
import com.vignesh.deepCloningSolution.type.Fiction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookTypeFactory {

    private static Map<String, BookType> cacheMap = new HashMap<>();

    static {
        BookType fictionType = new Fiction();
        fictionType.loadBooks();
        cacheMap.put("fiction", fictionType);

        BookType biographyType = new Biography();
        biographyType.loadBooks();
        cacheMap.put("biography", biographyType);
    }

    public static BookType getBooks(String type) throws Exception {

        if(type.equalsIgnoreCase("fiction") || type.equalsIgnoreCase("biography")) {
            BookType fiction = (BookType) cacheMap.get(type.toLowerCase());
            BookType fictionType = (BookType) fiction.clone();
            List<Book> booksClone = new ArrayList<>();
            for(Book book: fictionType.getBookList()) {
                booksClone.add((Book) book.clone());
            }
            fictionType.setBookList(booksClone);
            fictionType.setType(type);
            return fictionType;
        }
        else throw new IllegalArgumentException("Book Type Not Found.");
    }
}
