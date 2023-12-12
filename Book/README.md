Book

Objectives
Learn how to create a class to represent an object
Add private instance variables in your class
Add constructors to your class
Add accessor and mutator methods for your class
Add a toString() method to your class

Credit  Thanks to Shyamal Mitra from The University of Texas for the idea upon which this lab is based.

Lab Description
Today you will learn how to create your own class to represent a book. You will include all the basic components required of a class:  private instance variables, constructors, mutator methods, accessor methods, and a toString() method.

Lab Setup
PC/Mac	Download BookRunner.java and save the file to your local directory

Lab Directions

Book.java
In the same folder with BookRunner.java create a file called Book.java and define the class at the top of the file
What should the name of this class be?

Declare the two instance variables (aka fields or attributes) required for this lab. 
The first variable is a String and called bookName;
The second variable is an int and called bookISBN;
What access do these variables require (private or public)? Why?
Do you need to assign default values right when declaring these variables? Why or Why not?

Add two constructors to your class.
Make the first constructor a default constructor.
What name do you need to use for the constructor?
What should happen inside the default constructor?
Use these default values for the two instance variables: empty string for the book's name, 0 for the book's ISBN.
Make the second constructor an initialization constructor (make the first parameter the book name and the 2nd the ISBN).
What name do you need to use for the constructor?
What should happen inside the initialization constructor?
Remember to put the instance variables on the left side of the assignment operator, and the variables containing the values being passed in as parameters on the right side.
What is the difference in values assigned when you call the default vs initialization constructor?

Add a mutator method for each instance variable. Remember, mutator method names should start with set (Note: mutator and accessor method names simply prepend the word set or get in front of the instance variable name and then in true CamelCase fashion captialize the first letter of the instance variable name that follows set or get).
What is the return type for a mutator method?
How many arguments should you pass into each method?
What is the datatype of the argument passed in?

Add an accessor method for each instance variable. Remember, accessor method names should start with get.
What is the return type for an accessor method?
How many arguments should be passed into an accessor method?

Add the toString() method and return the name of the book, follow by a single space, followed by the book's ISBN number.
What is the return type of the  toString() method?
What is the purpose of the  toString() method?

BookRunner.java
Test your Book class by opening up BookRunner.java. There is a constructor call here to instantiate a new book object using the default constructor. Here we chose to store the reference to this new book object in the variable textBook. There is also a print statement that prints this book object that we created using the default constructor (NOTE: Printing an object implicitly utilizes the object's toString() method to print out the details of the object - usually we print at least the values of the object's instance variables).
Why does the output from the toString() method only show a space and 0 (hopefully)?

Create a 2nd new book using the initialization constructor for the book Hitchhikers Guide to the Galaxy with an ISBN number of 345391802.
utilizes the toString() method to print out the book details.
Is the output of the toString() method what you expected?
remember you don't actually have to put .toString() after the reference variable, since when printing an object the toString() method is implied.
For of the 1st book, which you created and whose reference variable is textBook, use the mutator methods you wrote to change the name of the book to Learn JAVA now!!! and the ISBN number to 12345678.
What method did you use to change the name? What type of method is this?

After changing the name of the book, call the getBookName() method and print just the name of the book.
What do you want to keep in mind when calling a return method if you want to see what it returns?
What type of method is getBookName()?

Add the below print statements to your BookRunner.java and make the appropriate changes and/or additions so that they print out the information from both of the books. 
System.out.println("Book 0 name: "+ nameOfBook0 + " ISBN(" + ISBNofBook0 + ")");
System.out.println("Book 1 name: "+ nameOfBook1 + " ISBN(" + ISBNofBook1 + ")");

Finally, use the existing toString() method to again print out the information for both books.
Can you actually call the  toString() method? Do you have to?
Think about how you would have to change the toString() method to print out the information in the same format you did in step 5.



Book.zip containing Book.java and BookRunner.java


