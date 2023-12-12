public class Main
{
	public static void main(String args[]) {
		Book textBook = new Book();
		System.out.println(textBook); 
    Book hitch = new Book("Hitchhikers Guide to the Galaxy", 345391802);
    System.out.println(hitch.toString());
    textBook.setName("Learn JAVA now!!!");
    textBook.setISBN(12345678);
    System.out.println(textBook.toString());
    System.out.println("Book 0 name: " + textBook.getBookName() + " ISBN(" + textBook.getBookISBN() + ")");
    System.out.println("Book 1 name: " + hitch.getBookName() + " ISBN(" + hitch.getBookISBN() + ")");
    System.out.println(textBook.getBookName() +  " " + textBook.getBookISBN());
    System.out.println(hitch.getBookName() + " " + hitch.getBookISBN());
	}
}