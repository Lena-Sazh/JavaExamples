package com.sazhina;

public class Book {
    String title;
    String author;
    int yearPublished;
    int priceUSD;
    boolean isPhysical;
    String[] genre = {"history", "romance", "science", "fiction", "fantasy"};
    int[] numberOfPages = {50, 100, 200, 300, 4000};

    public Book(String title, String author, int yearPublished, int priceUSD, boolean isPhysical) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.priceUSD = priceUSD;
        this.isPhysical = isPhysical;
    }

    public Book() {
    }

    String setTitle(String title) {
        this.title = title;
        return title;
    }

    String setAuthor(String author) {
        this.author = author;
        return author;
    }

    public void isPhysicalOrElectronic(Boolean isPhysical) {
        if (isPhysical) {
            System.out.println("This book is available in hard copy");
        } else {
            System.out.println("This is an ebook");
        }
    }

    void getAllNumberOfPages() {
        for (int numberOfPage : numberOfPages) {
            System.out.println("The list of all possible numbers of pages is: " + numberOfPage);
        }

    }

    void getAllGenres() {
        int i = 0;
        while (i < genre.length) {
            System.out.println("The list of genres: " + genre[i]);
            i++;
        }
    }
}
