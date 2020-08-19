package andrei.spring.springWebApp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author {

    private String firstName;
    private String lastName;
    private Set <Book> books;

}
