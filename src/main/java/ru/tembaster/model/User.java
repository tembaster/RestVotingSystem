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


}
