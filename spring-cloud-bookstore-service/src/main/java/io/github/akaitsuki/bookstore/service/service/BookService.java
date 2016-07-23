package io.github.akaitsuki.bookstore.service.service;


import io.github.akaitsuki.bookstore.service.domain.Book;

import java.util.List;

/**
 * Created by Jiachi on 7/11/2016.
 */
public interface BookService {

    List<Book> findBooks();
}
