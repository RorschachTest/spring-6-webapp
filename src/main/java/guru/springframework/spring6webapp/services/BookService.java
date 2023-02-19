package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Iterable<Book> allBooks();
}
