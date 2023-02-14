package com.codestates.github_homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubHomeWork {
    @GetMapping("/")
    public String homework() {
        return "To-do Application !";
    }
}
