package com.qa.humanproject.controllers;

import com.qa.humanproject.entities.Human;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class HumanController {
    
    @GetMapping("/test")
    public String testMe(){
    return "Hello there";
}
}



