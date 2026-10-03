import java.util.*;

class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {

        return "Book: " + title +
               "\nPrice: " + (int)price +
               "\nAuthor: " + author;
    }
}

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Author author = new Author(
                data[2].trim(),
                data[3].trim(),
                data[4].trim()
        );

        Book book = new Book(
                data[0].trim(),
                Double.parseDouble(data[1].trim()),
                author
        );

        System.out.println(book);

        sc.close();
    }
}