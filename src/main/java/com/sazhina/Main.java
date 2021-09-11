package com.sazhina;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("\"In Search of Lost Time\"", "Marcel Proust", 1913, 200, true);
        Book book2 = new Book("\"Foundation\"", "Isaac Asimov", 1993, 100, false);

        book.getAllNumberOfPages();
        book.getAllGenres();

        book1.isPhysicalOrElectronic(book1.isPhysical);
        book2.isPhysicalOrElectronic(book2.isPhysical);

        book1.setTitle("\"В поисках утраченного времени\"");
        book1.setAuthor("Марсель Пруст");

        book2.setTitle("\"Основание\"");
        book2.setAuthor("Айзек Азимов");

        System.out.println("New title is " + book1.title);
        System.out.println("New author is " + book1.author);
    }
}
