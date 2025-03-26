package com.vignesh.problem.test;

import com.vignesh.problem.factory.BookTypeFactory;
import com.vignesh.problem.type.BookType;

/*
Book objects are created using new operator every time a book object is needed, which is costly process.
Instead, keep a book object in the cache, clone it and override its data with new data every time.
 */
public class PrototypePatternProblemTest {
    public static void main(String[] args) {

        System.out.println("==============Fiction Books==============");
        BookType bookType = BookTypeFactory.getBooks("fiction");
        bookType.loadBooks();
        System.out.println(bookType);

        System.out.println("==============Biography Books==============");
        BookType bookType2 = BookTypeFactory.getBooks("biography");
        bookType2.loadBooks();
        System.out.println(bookType2);
    }
}


/*
Output::

==============Fiction Books==============
BookType{type='fiction', bookList=[Book{bookId=101, bookName='1001', bookStatus='Available', bookPrice=45.0},
Book{bookId=102, bookName='1002', bookStatus='Available', bookPrice=45.0}, Book{bookId=103, bookName='1003',
bookStatus='Available', bookPrice=45.0}, Book{bookId=104, bookName='1004', bookStatus='Available', bookPrice=45.0},
Book{bookId=105, bookName='1005', bookStatus='Available', bookPrice=45.0}]}
==============Biography Books==============
BookType{type='Biography', bookList=[Book{bookId=601, bookName='6001', bookStatus='Available', bookPrice=35.0},
Book{bookId=602, bookName='6002', bookStatus='Available', bookPrice=35.0}, Book{bookId=603, bookName='6003',
bookStatus='Available', bookPrice=35.0}, Book{bookId=604, bookName='6004', bookStatus='Available', bookPrice=35.0},
Book{bookId=605, bookName='6005', bookStatus='Available', bookPrice=35.0}]}
 */