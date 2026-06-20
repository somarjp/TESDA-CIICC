
public class Task11 {

        public static void main (String [] args) {
           Book Book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
           Book Book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
           Book Book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

           System.out.println("Book1:\n" + Book1.toString());
           System.out.println("\nBook2:\n" + Book2.toString());
           System.out.println("\nBook3:\n" + Book3.toString());

        }
}
