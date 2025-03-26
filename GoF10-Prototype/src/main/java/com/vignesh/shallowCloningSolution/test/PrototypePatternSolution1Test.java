package com.vignesh.shallowCloningSolution.test;

import com.vignesh.shallowCloningSolution.factory.BookTypeFactory;
import com.vignesh.shallowCloningSolution.type.BookType;

/*
Prototype Pattern using shallow cloning
 */
public class PrototypePatternSolution1Test {
    public static void main(String[] args) throws Exception {

        try{
            System.out.println("==============Fiction Books==============");
            BookType bookType = BookTypeFactory.getBooks("fiction");
            System.out.println(bookType);

            System.out.println("==============Biography Books==============");
            BookType bookType2 = BookTypeFactory.getBooks("biography");
            System.out.println(bookType2);

            System.out.println("==============Fiction Books==============");
            BookType bookType3 = BookTypeFactory.getBooks("fiction");
            System.out.println(bookType3);

            System.out.println("\n\n==============Modifications on 1st Fiction Books effects 2nd Fiction Books because " +
                    "of shallow cloning==============");
            bookType.getBookList().remove(0);
            System.out.println(bookType);
            System.out.println(bookType3);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


/*
Output::

==============Fiction Books==============
Book()
Book()
Book()
Book()
Book()
Book()
Book()
Book()
Book()
Book()
BookType{type='fiction', bookList=[Book{bookId=101, bookName='1001', bookStatus='Available', bookPrice=45.0},
Book{bookId=102, bookName='1002', bookStatus='Available', bookPrice=45.0}, Book{bookId=103, bookName='1003',
bookStatus='Available', bookPrice=45.0}, Book{bookId=104, bookName='1004', bookStatus='Available', bookPrice=45.0},
Book{bookId=105, bookName='1005', bookStatus='Available', bookPrice=45.0}]}
==============Biography Books==============
BookType{type='Biography', bookList=[Book{bookId=601, bookName='6001', bookStatus='Available', bookPrice=35.0},
Book{bookId=602, bookName='6002', bookStatus='Available', bookPrice=35.0}, Book{bookId=603, bookName='6003',
bookStatus='Available', bookPrice=35.0}, Book{bookId=604, bookName='6004', bookStatus='Available', bookPrice=35.0},
Book{bookId=605, bookName='6005', bookStatus='Available', bookPrice=35.0}]}
==============Fiction Books==============
BookType{type='fiction', bookList=[Book{bookId=101, bookName='1001', bookStatus='Available', bookPrice=45.0},
Book{bookId=102, bookName='1002', bookStatus='Available', bookPrice=45.0}, Book{bookId=103, bookName='1003',
bookStatus='Available', bookPrice=45.0}, Book{bookId=104, bookName='1004', bookStatus='Available', bookPrice=45.0},
Book{bookId=105, bookName='1005', bookStatus='Available', bookPrice=45.0}]}


==============Modifications on 1st Fiction Books effects 2nd Fiction Books because of shallow cloning==============
BookType{type='fiction', bookList=[Book{bookId=102, bookName='1002', bookStatus='Available', bookPrice=45.0},
Book{bookId=103, bookName='1003', bookStatus='Available', bookPrice=45.0}, Book{bookId=104, bookName='1004',
bookStatus='Available', bookPrice=45.0}, Book{bookId=105, bookName='1005', bookStatus='Available', bookPrice=45.0}]}
BookType{type='fiction', bookList=[Book{bookId=102, bookName='1002', bookStatus='Available', bookPrice=45.0},
Book{bookId=103, bookName='1003', bookStatus='Available', bookPrice=45.0}, Book{bookId=104, bookName='1004',
bookStatus='Available', bookPrice=45.0}, Book{bookId=105, bookName='1005', bookStatus='Available', bookPrice=45.0}]}
 */