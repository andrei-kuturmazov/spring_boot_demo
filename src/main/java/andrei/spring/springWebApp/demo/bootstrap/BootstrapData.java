package andrei.spring.springWebApp.demo.bootstrap;

import andrei.spring.springWebApp.demo.model.Author;
import andrei.spring.springWebApp.demo.model.Book;
import andrei.spring.springWebApp.demo.model.Publisher;
import andrei.spring.springWebApp.demo.repos.AuthorRepository;
import andrei.spring.springWebApp.demo.repos.BookRepository;
import andrei.spring.springWebApp.demo.repos.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {

        Publisher publisher = new Publisher();
        publisher.setCity("Minsk");
        publisher.setState("By");
        publisher.setZip("230000");
        publisherRepository.save(publisher);

        Author andrey = new Author("Andrey", "Kolesnik");
        Book book = new Book("Hello world", "200");

        andrey.getBooks().add(book);
        book.getAuthors().add(andrey);
        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        authorRepository.save(andrey);
        bookRepository.save(book);
        publisherRepository.save(publisher);

        Author vasili = new Author("Vasili", "Yan");
        Book secondBook = new Book("J2EE", "250");
        vasili.getBooks().add(secondBook);
        secondBook.getAuthors().add(vasili);
        secondBook.setPublisher(publisher);
        publisher.getBooks().add(secondBook);

        authorRepository.save(vasili);
        bookRepository.save(secondBook);
        publisherRepository.save(publisher);
    }
}
