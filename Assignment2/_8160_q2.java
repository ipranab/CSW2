class Book {
	private int bookId;
	private String name;
	private double price;

	Book(int bookId, String name, double price) {
		this.bookId = bookId;
		this.name = name;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Book Info -> name : " + name + ", book id : " + bookId + " , price : $" + price;
	}

	public boolean equals(Object b) {
		if (this == b)
			return true;
		if (b == null || getClass() != b.getClass())
			return false;
		Book book = (Book) b;
		return Double.compare(book.price, price) == 0;
	}
}

public class _8160_q2 {

	public static void main(String[] args) {
		Book b = new Book(1011, "UHV", 4000);
		Book b1 = new Book(1022, "COA", 6000);
		System.out.println(b);
		System.out.println(b1);
		if (b.equals(b1)) {
			System.out.println("The price is unchanged.");
		} else {
			System.out.println("The price is not similar.");
		}
	}

}
