package resources;

import interfaces.LibraryResource;

public class AudioBook implements LibraryResource {
    private final String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowed AudioBook: " + title);
    }

    @Override
    public String getTitle() {
        return title;
    }
}
