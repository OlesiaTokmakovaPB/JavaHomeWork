package com.pb.tokmakova.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("'Я досліджую світ'", " Таглина О.В.", "2018");
        Book book2 = new Book("'Летние упражнения на каждый день'", "Ефимова И.В.", "2017");
        Book book3 = new Book("'Точилка. Математика'", " Бибик М.М.", "2019");

        Reader reader1 = new Reader("Иванов И.И.", "125","Исторический", "20/08/1999", "0637851253");
        Reader reader2 = new Reader("Петров П.П.", "357", "Филологический", "04/09/2000", "0975882512");
        Reader reader3 = new Reader("Сидоров С.С", "121", "Математический", "30/10/1998", "0965885621");

        String[] takeTypeBooks = {"Природа", "Здоровье", "Математика"};
        String[] returnTypeBooks = {"Здоровье", "Математика"};

        Book[] takeBooks = {book1, book2, book3};
        Book[] returnBooks = {book1, book2, book3};

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        System.out.println("");
        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());
        System.out.println("");

        reader1.takeBook(5);
        reader1.returnBook(3);
        System.out.println("");
        reader2.takeBook(takeTypeBooks);
        reader2.returnBook(returnTypeBooks);
        System.out.println("");
        reader3.takeBook(takeBooks);
        reader3.returnBook(returnBooks);
    }
}
