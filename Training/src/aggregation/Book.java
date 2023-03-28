package aggregation;

public class Book {
	String bookName;
	float price;
	Author author;
	public Book(String bookName, float price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
public void printDetails()
{
	System.out.println("Book Details.....\nBook Name:"+bookName
			+"\nPrice:"+price+"\nAuthor Name:"+author.authorName
			+"\nAuthor age:"+author.age+"\nAuthor place:"+author.place);
}
	public static void main(String args[])
	{
		Author a=new Author("Author1",50,"Kottayam");
		Book b=new Book("Book1",150,a);
		b.printDetails();
	}
}
