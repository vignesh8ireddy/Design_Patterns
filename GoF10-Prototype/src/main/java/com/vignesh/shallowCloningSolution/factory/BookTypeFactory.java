package com.vignesh.shallowCloningSolution.factory;

import com.vignesh.shallowCloningSolution.type.Biography;
import com.vignesh.shallowCloningSolution.type.BookType;
import com.vignesh.shallowCloningSolution.type.Fiction;

import java.util.HashMap;
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

        if(type.equalsIgnoreCase("fiction")) {
            return (BookType) cacheMap.get(type.toLowerCase()).clone();
        }
        else if(type.equalsIgnoreCase("biography")) {
            return (BookType) cacheMap.get(type.toLowerCase()).clone();
        }
        else throw new IllegalArgumentException("Book Type Not Found.");
    }
}
