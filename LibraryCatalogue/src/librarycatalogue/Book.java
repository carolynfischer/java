package librarycatalogue;

/**
 *
 * @author carry
 */
public class Book {
    // properties. fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; // whether or not the book is checked out
    double dayCheckedOut = -1;
 
    // constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }
    
    // getters -> instance methods
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;
    }    

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }  

    public double getDayCheckedOut() {
        return this.dayCheckedOut;
    }  
    
    // setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
    }
    
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
