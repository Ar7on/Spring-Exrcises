package it.develhope.DependecyInjection.Controllers;

import it.develhope.DependecyInjection.Services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public  MyController (MyService myService){
        this.myService = myService;
    }
    @GetMapping
    public String helloMessage(){
        return "Ciao sei un bot";
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return myService.getName();
    }


}
