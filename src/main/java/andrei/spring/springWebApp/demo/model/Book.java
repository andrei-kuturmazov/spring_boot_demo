package andrei.spring.springWebApp.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {

    private String title;
    private String pages;
    private Set<Author> authors;
}
