package com.bridgelabs.Greeting_App.controller.service;

import com.bridgelabs.Greeting_App.GreetingAppRepository.GreetingRepository;
import com.bridgelabs.Greeting_App.entity.GreetingAppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

      @Service
      public class GreetingAppService {

    @Autowired
    private GreetingRepository greetingRepository;

          /**
           * getting first name from repository
           * @author Bridgelabs
           * @version 0.1
           * @since 3-10-2021
           * @param firstname
           * @return
           */
    public GreetingAppEntity getMessageWithFirstName(String firstname) {
        Optional<GreetingAppEntity> greetingAppEntity = greetingRepository.findByName(firstname);
        if (greetingAppEntity.isPresent()) {
            return greetingAppEntity.get();
        }
        return null;
    }

          /**
           * getting id from Repository
           *
           *  @author Bridgelabs
           *  @version 0.1
           *  @since 3-10-2021
           * @param id
           * @return
           */

    public GreetingAppEntity fingById(int id) {
        Optional<GreetingAppEntity> greetingAppEntity = greetingRepository.findById(id);
        if (greetingAppEntity.isPresent()) {
            return greetingAppEntity.get();
        }
        return null;
    }

          /**
           * getting list from entity
           *
           *  @author Bridgelabs
           *  @version 0.1
           *  @since 3-10-2021
           *
           *
           * @return
           */

    public List<GreetingAppEntity> listOfMessages() {
        return greetingRepository.findAll();
    }

          /**
           * delet id from entity
           *
           *  @author Bridgelabs
           *  @version 0.1
           *  @since 3-10-2020
           * @param id
           * @return
           */

    public String deletMessage(int id) {
        Optional<GreetingAppEntity>greetingAppEntity=greetingRepository.findById(id);
        if(greetingAppEntity.isPresent()){
            greetingRepository.delete(greetingAppEntity.get());
            return "messages deleted successfully";
        }
        return "record not exists with id:"+id;
    }
}