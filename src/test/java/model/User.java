package model;

import java.util.Objects;

public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public User(String email, String password, String firstName, String lastName) {
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User(" +
                "username= '" + email+ "'" +
                ", password= '" + password + "'" +
                ", first name= '" + firstName + "'" +
                ", last name= '" + lastName + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof User)) return false;
        User user=(User) o;
        return Objects.equals(getEmail(),user.getEmail()) &&
                Objects.equals(getPassword(),user.getPassword());
    }
}