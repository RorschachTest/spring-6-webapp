package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringBufferInputStream;

@Controller
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String findAllBooks(Model model){
        model.addAttribute("books", bookService.findAllBooks());

        return "books";
    }
}
