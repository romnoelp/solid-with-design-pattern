import interfaces.LibraryResource;
import interfaces.ResourceManager;

public class Student {
    private final ResourceManager resourceManager;

    public Student(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }

    public void borrowResource(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Invalid title provided.");
            return;
        }

        LibraryResource resource = resourceManager.findResource(title);

        if (resource == null) {
            System.out.println("Resource not found: " + title);
            return;
        }

        resource.borrow();
    }
}
