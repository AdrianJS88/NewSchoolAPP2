public class Books extends Main {
     private String booksList =
             "* 1984 by George Orwell.\n" +
             "* The Lord of the Rings by J.R.R. Tolkien.\n" +
             "* The Kite Runner by Khaled Hosseini.\n" +
             "* Harry Potter and the Philosopher's Stone by J.K. Rowling.\n" +
             "* Slaughterhouse-Five by Kurt Vonnegut.\n" +
             "* The Lion, the Witch, and the Wardrobe by C.S. Lewis.\n" +
             "* To Kill a Mockingbird by Harper Lee." ;

    public String getBooksList() {
        return booksList;
    }

    public void setBooksList(String booksList) {
        this.booksList = booksList;
    }
}
