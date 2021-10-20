package com.bridgelabs.Greeting_App.controller;

import com.bridgelabs.Greeting_App.controller.service.GreetingAppService;
import com.bridgelabs.Greeting_App.entity.GreetingAppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {


    @Autowired
    private GreetingAppService greetingAppService;
    @GetMapping("/hello")
    public String gethelloworld(){
        return "hello world";
    }
    @GetMapping(value= "/give_greeting_messagewith_firstname")
        public GreetingAppEntity giveGreetingMessageWithFirstName(@RequestParam String firstname){
        return greetingAppService.getMessageWithFirstName(firstname);
    }

    @GetMapping(value="/find_greeting_by_id")
    public GreetingAppEntity findGreetingById(int id){
        return  greetingAppService .fingById(id);
    }

    @GetMapping("/listof_greeting_messages")
    public List<GreetingAppEntity> listOfGreetinMesages(){
        return greetingAppService.listOfMessages();

    }
    @DeleteMapping("/delet_greeting-messages")
    public String  deletMessages(@RequestParam int id){
         return greetingAppService.deletMessage(id);
    }

}
