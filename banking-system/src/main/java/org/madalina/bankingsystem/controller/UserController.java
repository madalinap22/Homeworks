package org.madalina.bankingsystem.controller;


import org.madalina.bankingsystem.dto.User;
import org.madalina.bankingsystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping
    public List<User> getUsers() {
        return userService.getKnownUsers();
    }

    //obtinem datele unui utilizator cu un anumit ID
    @GetMapping("/{id}")
//    @RequestMapping("/{id}")
    public User getUserById(@PathVariable("id") int id){
            return userService.getUserById(id);
        }


   @DeleteMapping("/{id}")
//   @RequestMapping("/deletion/{id}")
    public String deleteUserById(@PathVariable("id") int id){
        userService.deleteUserById(id);
       return "Deleted";
   }

   @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
   }

   @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Integer id, @RequestBody User user)
   {
       return new ResponseEntity<>(userService.updateUser(id,user), HttpStatus.ACCEPTED);
   }



}






