package it.develhope.DependecyInjection.Components;

import it.develhope.DependecyInjection.Services.MyService;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    String myComponentName;

    public MyComponent (){
        this.myComponentName = "Arturo";
        System.out.println("my component name is: " + getMyComponentName());}

    public String getMyComponentName() {
        return myComponentName;
    }
}
