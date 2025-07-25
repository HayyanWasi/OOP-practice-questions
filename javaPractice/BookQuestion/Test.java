abstract class Book {
    String bookTitle;
    double bookPrice;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    abstract void setBookPrice();

    abstract void displayInfo();

}

class Fiction extends Book {
    Fiction(String bookTitle) {
        super(bookTitle);
        setBookPrice();
    }

    public void setBookPrice() {
        bookPrice = 24.99;
    }

    void displayInfo() {
        System.out.println("Book name :" + bookTitle);
        System.out.println("Book price :" + bookPrice);
    }
}

class NonFiction extends Book {
    NonFiction(String bookTitle) {
        super(bookTitle);
        setBookPrice();
    }

    @Override
    public void setBookPrice() {
        bookPrice = 37.99;
    }

    void displayInfo() {
        System.out.println("Book name :" + bookTitle);
        System.out.println("Book price :" + bookPrice);
    }
}

public class Test {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Fiction("the habbits");
        books[1] = new Fiction("rich dad poor dad");
        books[2] = new Fiction("dad is dad");
        books[3] = new NonFiction("fairyTale");

        System.out.println("Display allthe books");
        for (Book book : books) {
            book.displayInfo();
        }

    }
}