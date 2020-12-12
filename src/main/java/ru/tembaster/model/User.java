package ru.tembaster.model;


public class User extends AbstractBaseEntity {

    private String email;
    private String password;
    private Role role;
    private Boolean isVoted;

    public User() {
    }

    public User(Integer id, String email, String password, Role role, Boolean isVoted) {
        super(id);
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
