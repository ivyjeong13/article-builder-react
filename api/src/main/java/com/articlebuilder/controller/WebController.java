package com.articlebuilder.controller;

import java.util.Arrays;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.articlebuilder.model.User;
import com.articlebuilder.repo.UserRepository;

@RestController
public class WebController {
  
  @Autowired
  UserRepository repository;

  @RequestMapping("/delete")
  public String delete(){
    repository.deleteAll();
    return "Done";
  }

  @RequestMapping("/save")
  public String save(){
    repository.save(new User("JSA-1", "Jack", "Smith", "jellybean123"));
    return "Done";
  }

  @RequestMapping("/findall")
  public String findAll(){
    String result = "";
    Iterable<User> users = repository.findAll();

    for(User user : users){
      result += user.toString() + "<br>";
    }

    return result;
  }

  @RequestMapping("/findbyid")
  public String findById(@RequestParam("id") String id){
    String result = "";
    result = repository.findOne(id).toString();
    return result;
  }

  @RequestMapping("/findbylastname")
  public String fetchDataByLastName(@RequestParam("lastname") String lastName){
    String result = "";

    for(User user : repository.findByLastName(lastName)){
      result += user.toString() + "<br>";
    }

    return result;
  }
}