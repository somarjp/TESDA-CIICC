public class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;

    }

    public String toString() {
        return "Title: " + this.title +
                "\nAuthor: " + this.author +
                "\nYear Published: " + this.yearPublished +
                "\nPrice: $" + this.price;
    }


}

