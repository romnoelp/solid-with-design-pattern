package resources;

import interfaces.LibraryResource;

public class Book implements LibraryResource {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed Book: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
