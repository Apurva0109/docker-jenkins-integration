package com.javatechie.docker_images_using_jenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerJenkinsIntegration {

    @GetMapping("/hello")
    public String dockerJenkinsIntegration() {
        return "Hi from Docker Jenkins Integration!";
    }

    @GetMapping("/newBuild")
    public String newBuild() {
        return "Check if new build is created as soon as push changes to git";
    }
}
