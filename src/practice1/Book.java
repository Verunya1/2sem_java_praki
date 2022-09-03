package practice1;

public class Book {
    private String book;

    public Book(String b) {
        book = b;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String ballForSport) {
        this.book = ballForSport;
    }

    public static void main(String[] args) {
        Ball b = new Ball("7 навыков высокоэффективных людей");
    }
}
