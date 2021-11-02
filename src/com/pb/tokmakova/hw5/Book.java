package com.pb.tokmakova.hw5;

class Book {
    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getInfo() {
        return "[Название книги: " + name + "]" + ", [автор книги: " + author + "]" +", [год издания: " + year + " г."+ "]" ;
    }
}