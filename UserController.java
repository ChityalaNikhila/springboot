package com.example.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/Adduser")
    public User adduser(@RequestBody User user) {
        User u = new User();
        u.setUserid(user.getUserid());
        u.setUsername(user.getUsername());
        u.setUserEmail(user.getUserEmail());
        u.setAge(user.getAge());
        u.setGender(user.getGender());
        u.setNationality((user.getNationality()));
        return u;

    }

    @GetMapping("/viewAll")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/viewAll/{id}")
    public Optional<User> getUser(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

    @PutMapping("/edit/{id}")
    public String update(@RequestBody User updateUser, @PathVariable Integer id) {
        return userRepository.findById(id)
                .map(User -> {
                    User.setUsername(updateUser.getUsername());
                    User.setUserEmail(updateUser.getUserEmail());
                    User.setAge(updateUser.getAge());
                    User.setGender(updateUser.getGender());
                    User.setNationality(updateUser.getNationality());
                    userRepository.save(User);
                    return "User details updated successfully";
                }).orElseGet(() -> {
                    return "No such user exist!";
                });


    }


}
