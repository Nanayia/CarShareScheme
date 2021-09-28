package PP1S22021.FRI1030PMGroup5.CarShareScheme.services;


import PP1S22021.FRI1030PMGroup5.CarShareScheme.repositories.BookRepository;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Autowired

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}