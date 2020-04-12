package com.tts.ttTwitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tts.ttTwitter.model.Tweet;
import com.tts.ttTwitter.model.User;
import com.tts.ttTwitter.service.TweetService;
import com.tts.ttTwitter.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private TweetService tweetService;
    
    @GetMapping(value = "/users/{username}")
    public String getUser(@PathVariable(value="username") String username, Model model) {	
        User user = userService.findByUsername(username);
        List<Tweet> tweets = tweetService.findAllByUser(user);
        model.addAttribute("tweetList", tweets);
        model.addAttribute("user", user);
        return "user";
    }
    
 /*   @GetMapping(value = "/users")
    public String getUsers(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        SetTweetCounts(users, model);
        return "users";
    } */
}
	
