package resources;

import interfaces.LibraryResource;

public class Journal implements LibraryResource {
    private final String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed Journal: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
