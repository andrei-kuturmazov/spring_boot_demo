package andrei.spring.springWebApp.demo.repos;

import andrei.spring.springWebApp.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
