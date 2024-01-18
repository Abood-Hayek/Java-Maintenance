package src;

/**
 * A class called circle is designed as shown in the following class diagram. It contains:
 * 
 * 1) Two private instance variables: radius (of type double) and color (of type String),
 *    with default value of 1.0 and "red", respectively.
 * 2) Two overloaded constructors;
 * 3) Two public methods: getRadius() and getArea().
 * 
 * The source codes for Circle is as follows:
 */

public class Book extends BookBase{
   

   private Author   author;

   public Book (String name, Author author, double price) {
      super(name,price);
      this.author  = author;
   }

   public Book (String name, Author author, double price, int qtyInStock) {
      super(name,price,qtyInStock);
      this.author     = author;
   }


   public Author getAuthor() {
      return this.author;
   }

   public String getAuthorName() {
      return this.author.getName();
   }

   public String getAuthorEmail() {
      return this.author.getEmail();
   }

   public char getAuthorGender() {
      return this.author.getGender();
   }

   public String toString() {
      return "'" + this.getName() +"' by " + author;
   }   
}