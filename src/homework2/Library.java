package homework2;
/*
 *@author 27377-sun chao
 *@date 2020/7/14
 *@school  SiChuan University
 */

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 27377
 */
public class Library {
    HashSet<Book> books = new HashSet();

    public void addBook(Book book) {
        if (!books.add(book)){
            System.out.println("请勿重复添加图书  "+book.getId()+":"+book.getName());
        }
    }

    public void check() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void delete(int id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
            }
        }
    }


}