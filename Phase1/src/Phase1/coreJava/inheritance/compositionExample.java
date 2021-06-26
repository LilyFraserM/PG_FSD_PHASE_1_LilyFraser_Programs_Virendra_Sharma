package Phase1.coreJava.inheritance;

import java.util.ArrayList;
import java.util.List;
class Book{
	public String title;
	public String author;
	
Book(String title,String author){
	this.title = title;
	this.author = author;
}
}

class Library{
	private final List<Book> books;
	Library(List<Book> books)
	{
		this.books =books;
	}
	
	public List<Book>getTotalBooksInLibrary()
	{
		return books;
	}
}
public class compositionExample {
	public static void main(String[] args) {
		
		Book b1 = new Book("Thinking in java", "Bruce Eckel");
		Book b2 = new Book("Java:Complete reffn", "Herbert Schildt");
		Book b3 = new Book("Head first java", "BOreilly");
		Book b4 = new Book("Thinking in c++", "Yashwant Kanetkar");
		
		List<Book>book = new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		
		Library library = new Library(book);
		
		List<Book>books = library.getTotalBooksInLibrary();
		
		for(Book bk: books) {
			System.out.println("Title: " + bk.title + "and" + "Author : "+ bk.author);
		}
	}

}
