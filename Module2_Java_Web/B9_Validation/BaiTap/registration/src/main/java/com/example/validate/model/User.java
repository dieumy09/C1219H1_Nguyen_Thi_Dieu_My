package com.example.validate.model;

import com.example.validate.validation.Email;
import com.example.validate.validation.PhoneNumber;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firt_name")
    @NotEmpty
    @Size(min=5, max=45)
    private String firstName;

    @Column(name= "last_name")
    @NotEmpty
    @Size(min=5, max=45)
    private String lastName;

    @Column(name = "phone_number")
    @PhoneNumber
    private String phoneNumber;

    @Column(name = "age")
    @Min(18)
    private int age;

    @Column(name = "email")
    @Email
    private String email;

    public User() {
    }

    public User(@NotEmpty @Size(min=5, max=45) String firstName, @NotEmpty @Size(min=5, max=45) String lastName, @PhoneNumber String phoneNumber, @Min(18) int age, @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
