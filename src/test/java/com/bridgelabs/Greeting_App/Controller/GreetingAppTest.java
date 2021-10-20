package com.bridgelabs.Greeting_App.Controller;

import com.bridgelabs.Greeting_App.controller.GreetingController;
import com.bridgelabs.Greeting_App.controller.service.GreetingAppService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class GreetingAppTest {

    @InjectMocks
     private GreetingController greetingController;
    @Mock
    private GreetingAppService greetingAppService;

    @Test
   public void messageTest() {

    }
}
