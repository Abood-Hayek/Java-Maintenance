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

public class Book3 extends BookBase{

   private Author[]  authors = new Author[5];
   private int       numAuthors = 0;

   public Book3(String name, double price) {
      super(name, price);
   }

   public Book3(String name, double price, int qtyInStock) {
      super(name, price, qtyInStock);
   }


   public Author[] getAuthors() {
      return this.authors;
   }

   public void printAuthors() {
      int authorNo = 0;
      for (Author a : this.authors) {
         if (a == null) {
            continue;
         }
         System.out.println("("+(++authorNo)+") "+a);
      }
   }

   public void addAuthor(Author author)
   {
      for (int i = 0; i < authors.length; i++)
      {
         if (authors[i] == null) {
            authors[i] = author;
            ++numAuthors;
            break;
         }
      }
   }

   public boolean removeAuthorByName(String authorName)
   {
      for (int i = 0; i < authors.length; i++)
      {
         if (authors[i] != null && authorName.equalsIgnoreCase(authors[i].getName()) ) {
            authors[i] = null;
            --numAuthors;
            return true;
         }
      }
      return false;
   }

   public String toString() {
      return "'" + this.getName() +"' by " + numAuthors + " authors";
   }   
}