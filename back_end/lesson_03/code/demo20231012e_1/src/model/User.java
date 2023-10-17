package model;

public class User {
    private String name;
    private String email;
    private long id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(long id, String name, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
