import managers.Library;
import resources.Book;
import resources.Journal;
import resources.AudioBook;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addResource(new Book("Java Basics"));
        library.addResource(new Journal("TypeScript today, JavaScript yesterday"));
        library.addResource(new AudioBook("Interview Samples"));

        Student student = new Student(library);

        student.borrowResource("Java Basics");
        student.borrowResource("TypeScript today, JavaScript yesterday");
        student.borrowResource("Interview Samples");
        student.borrowResource("Unknown Resource");
    }
}
