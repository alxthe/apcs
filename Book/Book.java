public class Book {
  String bookName;
  int bookISBN;

public Book() {
  bookName = "";
  bookISBN = 0;
}
public Book(String name, int ISBN) {
  bookName = name;
  bookISBN = ISBN;
}

public String getBookName() {
  return bookName;
}

public int getBookISBN() {
  return bookISBN;
}

public void setName(String newName) {
  bookName = newName;
}

public void setISBN(int newISBN) {
  bookISBN = newISBN;
}

public String toString() {
  return bookName + " " + bookISBN;
}
}