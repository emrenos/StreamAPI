import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookCollection {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Data Structures and Algorithms");
        books.add("Introduction to Java");
        books.add("Advanced Python");
        books.add("Machine Learning Basics");
        books.add("Deep Dive Into Databases");

        List<String> afterDropWhile = books.stream()
                .dropWhile(book -> book.startsWith("Data"))
                .toList();
        System.out.println("dropWhile Sonucu: " + afterDropWhile);

        List<String> afterSkip = books.stream()
                .skip(2)
                .toList();
        System.out.println("Skip Sonucu: " + afterSkip);

    }
}
