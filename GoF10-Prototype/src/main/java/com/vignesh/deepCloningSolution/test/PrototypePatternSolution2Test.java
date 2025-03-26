package com.vignesh.deepCloningSolution.test;

import com.vignesh.deepCloningSolution.factory.BookTypeFactory;
import com.vignesh.deepCloningSolution.type.BookType;

/*
Prototype Pattern using deep cloning
 */
public class PrototypePatternSolution2Test {
    public static void main(String[] args) {

        try{
            System.out.println("==============Fiction Books==============");
            BookType bookType = BookTypeFactory.getBooks("fiction");
            bookType.loadBooks();
            System.out.println(bookType);

            System.out.println("==============Biography Books==============");
            BookType bookType2 = BookTypeFactory.getBooks("biography");
            bookType2.loadBooks();
            System.out.println(bookType2);

            System.out.println("==============Fiction Books==============");
            BookType bookType3 = BookTypeFactory.getBooks("fiction");
            bookType3.loadBooks();
            System.out.println(bookType3);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}