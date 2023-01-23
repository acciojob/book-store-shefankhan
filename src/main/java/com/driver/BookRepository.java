package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public BookRepository(){
        
    }

    public Book save(Book book){
        return null;
    }

    public Book findBookById(int id){

        return null;
    }

    public List<Book> findAll(){
        return null;
    }

    public void deleteBookById(int id){
        return;
    }

    public void deleteAll(){
        return;
    }

    public List<Book> findBooksByAuthor(String author){
        return null;
    }

    public List<Book> findBooksByGenre(String genre){
        return null;
    }
}
