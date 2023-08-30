package namegenerator;

import java.util.ArrayList;
import java.util.List;

public class UniqueNameGenerator {
    private static int counter = 1;
    private static List<String> uniqueNames = new ArrayList<>();

    public static String generateUniqueName() {
        // Generate a unique name based on timestamp and counter
        String uniqueName = "Name_" + System.currentTimeMillis() + "_" + counter;

        // Increment the counter for the next execution
        counter++;

        // Add the unique name to the list
        uniqueNames.add(uniqueName);

        return uniqueName;
    }

    public static List<String> getUniqueNames() {
        return uniqueNames;
    }

    public static void main(String[] args) {
        // Generate and print a unique name
        String newName = generateUniqueName();
        System.out.println("Generated Unique Name: " + newName);

        // Get the list of all unique names
        List<String> allUniqueNames = getUniqueNames();
        System.out.println("All Unique Names:");
        for (String name : allUniqueNames) {
            System.out.println(name);
        }
    }
}

