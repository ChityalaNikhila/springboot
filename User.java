package com.example.springbootproject;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int userid;
    private String username;
    private String userEmail;
    private String gender;
    private int age;
    private String nationality;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public User(int userid, String username, String userEmail, String gender, int age, String nationality) {
        this.userid = userid;
        this.username = username;
        this.userEmail = userEmail;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }
    public User(){}

    @Override
    public String toString() {
        return "UserController{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
