import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        ArrayList<String> roasts = new ArrayList<>();

        //   add light, medium, medium, dark to the array list, one at a time
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts);

        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roasts.contains("dark");
        System.out.println(result); // Return a boolean if it contains the data specified (e.g. true)

        result = roasts.contains("espresso");
        System.out.println(result); // Return a boolean if it contains the data specified (e.g. false)

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println(index);

        // 4. Check if the array list is empty
        result = roasts.isEmpty();
        System.out.println(result);

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        ArrayList<String> emptyList = new ArrayList<>();
        result = emptyList.isEmpty();
        System.out.println(result);

        // 5.a Add the espresso roast to the array and try to add it to an out of bounds index (e.g. index 9 when length is smaller)
//        roasts.add(9, "espresso"); // Throws error
        roasts.add("espresso");
        System.out.println(roasts);

        // 6. Remove the espresso roast
//        roasts.remove(4); // Remove specified index (e.g. value @ index 4)
//        System.out.println(roasts);

        roasts.remove("espresso"); // Remove specified value in array (e.g. "espresso")
        System.out.println(roasts);

        roasts.remove(roasts.lastIndexOf("medium")); // Will remove last medium instance from list
        // 7. Remove the element at index 2
        roasts.remove(2);
        System.out.println(roasts);

        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();

        usernames.put("Casey", "fridaynext");
        usernames.put("Vivian", "viviancan");
        usernames.put("Trant", "trantbatey");

        System.out.println(usernames);

        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();
        System.out.println(usernames);

        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Casey", "fridaynext");
        System.out.println(usernames);

        // 4. use the .putIfAbsent() method to add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        usernames.putIfAbsent("Vivian", "viviancan");
        usernames.putIfAbsent("Casey", "XpenguinX");
        System.out.println(usernames);

        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        //.putIfAbsent() only checks if the key is absent, and only will add the element if the key is absent

        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Casey");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        usernames.replace("Vivian", "viviancandev");
        System.out.println(usernames);

        // 8. Use the .clear() method to clear the map
        usernames.clear();
        System.out.println(usernames);

        // 9. Use the .isEmpty() method to verify that it was cleared
        result = usernames.isEmpty();
        System.out.println(result);

    }
}
