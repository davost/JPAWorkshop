package se.lexicon.jpaworkshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import se.lexicon.jpaworkshop.entity.Author;
import se.lexicon.jpaworkshop.dao.AuthorDAO;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AuthorDAOTest {

    @Autowired
    private AuthorDAO testObject;

    @Test
    void save() {
        Author actualData = testObject.create(new Author("sven", "svensson", LocalDate.parse("2020-05-10")));
        Author expectedData = testObject.findById(1);
        assertEquals(expectedData, actualData);

    }



}
