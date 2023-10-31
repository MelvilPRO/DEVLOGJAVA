package Books;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book example = new Book("Mansion", "Thommas", BookType.Police, 459);
		System.out.println(example);
		System.out.println(BooksDataBase.GetNumberOfBooks());
		//BooksDataBase.DisplayBooks();
		
		BooksDataBase.DisplayBooks("Ma");
	}
}
