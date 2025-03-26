package com.vignesh.shallowCloningSolution.model;

public class Book {
    private Integer bookId;
    private String bookName;
    private String bookStatus;
    private Float bookPrice;

    public Book() {
        System.out.println("Book()");
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
