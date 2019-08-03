package edu.cursor.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hi(){
        return "Hello, all";
    }
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
//    @GetMapping("/helloo")
    public String hello(@PathVariable String name){
        return "Hello, all" + name;
    }
//    ?name=
//    /api/v1/hello

}
