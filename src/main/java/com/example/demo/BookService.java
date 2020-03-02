package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public void create(Book book){
        System.out.println(book);
    }

    public void findBookById(int id){
        System.out.println("I am selecting");
    }

    public void update(int id){
        System.out.println("I am updating");
    }

    public void delete(int id){
        System.out.println("I am delating");
    }
}
