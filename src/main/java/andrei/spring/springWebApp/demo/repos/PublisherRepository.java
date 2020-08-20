package andrei.spring.springWebApp.demo.repos;

import andrei.spring.springWebApp.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
