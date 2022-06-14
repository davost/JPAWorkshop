package se.lexicon.jpaworkshop.entity;

import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Details {

    // todo: define fields with private...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;
    private String email;
    private String name;
    private LocalDate birthDate;

    public Details() {
    }

    public Details(int detailsId, String email, String name, LocalDate birthDate) {
        this.detailsId = detailsId;
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email != null)  {throw new IllegalArgumentException("Username already exists");}
        this.email = email;
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
        Details details = (Details) o;
        return detailsId == details.detailsId && email.equals(details.email) && name.equals(details.name) && birthDate.equals(details.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsId, email, name, birthDate);
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsId=" + detailsId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    // todo: define constructors
    //    // todo: define setters and getters
    // todo: define equal and hash code method + toString


    // todo: map java class to database table with Entity annotation and follow the JPA examples


}
