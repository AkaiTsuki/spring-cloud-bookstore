package io.github.akaitsuki.bookstore.service.service.impl;


import io.github.akaitsuki.bookstore.service.domain.Book;
import io.github.akaitsuki.bookstore.service.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Jiachi on 7/11/2016.
 */
@Service
public class BookServiceImpl implements BookService {

    @Override
    public List<Book> findBooks() {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("Docker in Action");
        book1.setIsbn(UUID.randomUUID().toString());
        books.add(book1);

        Book book2 = new Book();
        book2.setName("jQuery in Action");
        book2.setIsbn(UUID.randomUUID().toString());
        books.add(book2);

        return books;
    }
}
