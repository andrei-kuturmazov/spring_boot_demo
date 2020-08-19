package andrei.spring.springWebApp.demo.bootstrap;

import andrei.spring.springWebApp.demo.model.Author;
import andrei.spring.springWebApp.demo.model.Book;
import andrei.spring.springWebApp.demo.repos.AuthorRepository;
import andrei.spring.springWebApp.demo.repos.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        Author andrey = new Author("Andrey", "Kolesnik");
        Book book = new Book("Hello world", "200");
        andrey.getBooks().add(book);
        book.getAuthors().add(andrey);
        authorRepository.save(andrey);
        bookRepository.save(book);

        Author vasili = new Author("Vasili", "Yan");
        Book secondBook = new Book("J2EE", "250");
        vasili.getBooks().add(secondBook);
        secondBook.getAuthors().add(vasili);
        authorRepository.save(vasili);
        bookRepository.save(secondBook);
    }
}
