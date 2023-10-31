package Books;
import java.util.ArrayList;

public class BooksDataBase
{
	static private ArrayList<Book> books = new ArrayList<Book>();
	
	public static ArrayList<Book> GetBooks()
	{
		return books;
	}

	public static void SetBooks(ArrayList<Book> books)
	{
		BooksDataBase.books = books;
	}
	
	public static void AddBook(Book addedBook)
	{
		books.add(addedBook);
	}
	
	public static void AddBooks(ArrayList<Book> addedBooks)
	{
		for (int bookIndex = 0; bookIndex < addedBooks.size(); bookIndex++)
		{
			Book currentBook = books.get(bookIndex);
			AddBook(currentBook);
		}
	}
	
	public static int GetNumberOfBooks()
	{
		return books.size();
	}
	
	public static void DisplaySingleBook(Book bookTarget)
	{
		System.out.println("Name of the book: " + bookTarget.GetName());
		System.out.println("Name of the author: " + bookTarget.GetAuthor());
		System.out.println("BookType of the book: " + bookTarget.GetBookType());	
		System.out.println("Numbre of pages in the book: " + bookTarget.GetNumberOfPages());
	}
	
	public static void DisplayBooks()
	{
		for (int bookIndex = 0; bookIndex < books.size(); bookIndex++)
		{
			Book currentBook = books.get(bookIndex);
			DisplaySingleBook(currentBook);
		}
	}
	
	public static void DisplayBooks(String filter)
	{
		for (int bookIndex = 0; bookIndex < books.size(); bookIndex++)
		{
			Book currentBook = books.get(bookIndex);
			String currentBookName = currentBook.GetName();
			
			if (currentBookName.contains(filter))
			{
				DisplaySingleBook(currentBook);
			}
		}
	}
}
