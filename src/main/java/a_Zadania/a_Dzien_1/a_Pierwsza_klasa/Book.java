package a_Zadania.a_Dzien_1.a_Pierwsza_klasa;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private Author author = new Author();
    private  List<String> listOfAuthor;
    private int id;
    private String title;
    private boolean available = true;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, List <String> listOfAuthor) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.listOfAuthor = new ArrayList<>(10);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<String> getListOfAuthor() {
        return listOfAuthor;
    }

    public void setListOfAuthor(List<String> listOfAuthor) {
        this.listOfAuthor = listOfAuthor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
