package Books;

public class Book 
{
	private String name;
	private String author;
	private BookType bookType;
	private int numberOfPages;
	
	Book(String nameInit, String authorInit, BookType bookTypeInit, int numberOfPagesInit)
	{
		this.name = nameInit;
		this.author = authorInit;
		this.bookType = bookTypeInit;
		this.numberOfPages = numberOfPagesInit;
		BooksDataBase.AddBook(this);
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public String GetAuthor()
	{
		return author;
	}
	
	public void SetAuthor(String author)
	{
		this.author = author;
	}
	
	public BookType GetBookType()
	{
		return bookType;
	}
	
	public void SetBookType(BookType BookType)
	{
		this.bookType = BookType;
	}
	
	public int GetNumberOfPages()
	{
		return numberOfPages;
	}
	
	public void SetNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
}
