package com.vignesh.problem.factory;

import com.vignesh.problem.type.Biography;
import com.vignesh.problem.type.BookType;
import com.vignesh.problem.type.Fiction;

public class BookTypeFactory {

    public static BookType getBooks(String type) {
        if(type.equalsIgnoreCase("fiction")) {
            return new Fiction();
        }
        else if(type.equalsIgnoreCase("biography")) {
            return new Biography();
        }
        else throw new IllegalArgumentException("Book Type Not Found.");
    }
}
