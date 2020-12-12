package ru.tembaster.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="users")
public class User extends AbstractNamedEntity {

    @Column(name = "email", nullable = false, unique = true)
    @NotBlank
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    @NotBlank
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "is_voted", nullable = false, columnDefinition = "bool default false")
    private Boolean isVoted;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Role role, Boolean isVoted) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
        this.isVoted = isVoted;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getVoted() {
        return isVoted;
    }

    public void setVoted(Boolean voted) {
        isVoted = voted;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", isVoted=" + isVoted +
                '}';
    }
}
