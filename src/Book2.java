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

public class Book2 extends BookBase{

   private Author[] authors;

   public Book2(String name, Author[] authors, double price) {
      super(name,price);
      this.authors = authors;
   }

   public Book2(String name, Author[] authors, double price, int qtyInStock) {
      super(name, price, qtyInStock);
      this.authors    = authors;
   }

   public Author[] getAuthors() {
      return this.authors;
   }

   public void printAuthors() {
      int authorNo = 0;
      for (Author a : this.authors) {
         System.out.println("("+(++authorNo)+") "+a);
      }
   }

   public String toString() {
      return "'" + this.getName() +"' by " + authors.length + " authors";
   }   
}