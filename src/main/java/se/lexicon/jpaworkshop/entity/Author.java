package se.lexicon.jpaworkshop.entity;

//import ch.qos.logback.classic.pattern.LineOfCallerConverter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String firstName;
    private String name;
    private LocalDate birthDate;

    public Author() {
            }

    public Author(int authorId, String firstName, String name, LocalDate birthDate) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Author(String firstName, String name, LocalDate birthDate) {
        this.firstName = firstName;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorId == author.authorId && firstName.equals(author.firstName) && name.equals(author.name) && birthDate.equals(author.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, firstName, name, birthDate);
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
