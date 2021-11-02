package com.pb.tokmakova.hw5;

public class Reader {
    private String fio;
    private String birthDate;
    private String phone;
    private String faculty;
    private String ticketNumber;


    public Reader(String fio, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(this.fio + " взял " + count + " книги.");
    }

    public void takeBook(String[] books) {
        System.out.println(this.fio + " взял книги: " + String.join(", ", books));
    }

    public void takeBook(Book[] books) {
        String[] output = new String[books.length];
        for (int i = 0; i < books.length; i++)
            output[i] = books[i].getName() + "(" + books[i].getAuthor() + " " + books[i].getYear() + " г.)";
        System.out.println(this.fio + " взял книги: "+ String.join(", ", output));
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }
    public void returnBook(String[] books) {
        System.out.println(this.fio + " вернул книги: " + String.join(", ", books));
    }

    public void returnBook(Book[] books) {
        String[] output = new String[books.length];
        for (int i = 0; i < books.length; i++)
            output[i] = books[i].getName() + "(" + books[i].getAuthor() + " " + books[i].getYear() + " г.)";
        System.out.println(this.fio + " вернул книги: "+ String.join(", ", output));
    }

    public String getInfo() {
        return "[ФИО: " + fio + "]"+ ", [номер читательского билета: " + ticketNumber + "]"+", [факультет: " + faculty +
                "]" + ", [дата рождения: " + birthDate + "]" + ", [телефон: " + phone + "]" ;
    }
}
