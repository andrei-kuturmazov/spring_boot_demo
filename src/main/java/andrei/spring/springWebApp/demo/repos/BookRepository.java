package andrei.spring.springWebApp.demo.repos;

import andrei.spring.springWebApp.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Long> {
}
