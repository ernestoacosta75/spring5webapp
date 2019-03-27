package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * This will be the component invoked from the
 * client directly and will have in charge all the
 * business logic related to the Book entities.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
