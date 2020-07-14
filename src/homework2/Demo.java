package homework2;
/*
 *@author 27377-sun chao
 *@date 2020/7/14
 *@school  SiChuan University
 */

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1,"开眼界","David",15.8);
        Book book2 = new Book(2,"眼界","David",15.8);
        Book book3 = new Book(3,"开界","David",15.8);
        Book book4 = new Book(4,"开眼界","David",15.8);
        Book book5 = new Book(1,"开眼界","David",15.8);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.check();

        library.delete(2);

        library.check();



    }
}