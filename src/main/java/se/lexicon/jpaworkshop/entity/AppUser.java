package se.lexicon.jpaworkshop.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class AppUser {
    // todo: define fields with private...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;
    private String username;
    private String password;
    private LocalDate regDate;
    @OneToOne
    @JoinColumn(name = "userDetails_id")
    private Details userDetails;

    public AppUser() {
    }

    public AppUser(int appUserId, String username, String password, LocalDate regDate, Details userDetails) {
        this.appUserId = appUserId;
        this.username = username;
        this.password = password;
        this.regDate = regDate;
        this.userDetails = userDetails;
    }

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws IllegalArgumentException {
        if (username != null)  {throw new IllegalArgumentException("Username already exists");}
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Details getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(Details userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return appUserId == appUser.appUserId && username.equals(appUser.username) && password.equals(appUser.password) && regDate.equals(appUser.regDate) && userDetails.equals(appUser.userDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUserId, username, regDate, userDetails);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "appUserId=" + appUserId +
                ", username='" + username + '\'' +
                ", regDate=" + regDate +
                ", userDetails=" + userDetails +
                '}';
    }

    // todo: define constructors
    // todo: define setters and getters
    // todo: define equal and hash code method + toString

    // todo: map java class to database table with Entity annotation and follow the JPA examples


}
