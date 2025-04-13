package managers;

import interfaces.LibraryResource;
import interfaces.ResourceManager;

import java.util.ArrayList;
import java.util.List;

public class Library implements ResourceManager {
    private final List<LibraryResource> resources = new ArrayList<>();

    public void addResource(LibraryResource resource) {
        resources.add(resource);
    }

    @Override
    public LibraryResource findResource(String title) {
        for (LibraryResource resource : resources) {
            if (resource == null) continue;

            String resourceTitle = resource.getTitle();
            if (resourceTitle == null) continue;

            if (title.equalsIgnoreCase(resourceTitle)) return resource;
        }

        return null;
    }
}
