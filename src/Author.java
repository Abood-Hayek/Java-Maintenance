package src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Author {
   
private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
// just one for save resource
private static Pattern pattern = Pattern.compile(EMAIL_REGEX)

    private String name;
    private String email;
    private char   gender;

    public Author (String name, String email, char gender) {
        this.name   = name;
        this.email  = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String setEmail) {
        Matcher matcher = pattern.matcher(setEmail);
    if (matcher.matches()) {
        this.email = setEmail;
         } else {
        System.out.println("Does not conform to the basic email format");
    }
    } 

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}