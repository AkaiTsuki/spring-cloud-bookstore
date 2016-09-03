package io.github.akaitsuki.bookstore.service.controller;



import io.github.akaitsuki.bookstore.service.domain.Book;
import io.github.akaitsuki.bookstore.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Jiachi on 7/11/2016.
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("services/books")
    @ResponseBody
    List<Book> loadBooks(HttpServletRequest req) {
        System.out.println("X-AUTH-TEST HEADER: "+req.getHeader("x-auth-test"));
        return bookService.findBooks();
    }
}
