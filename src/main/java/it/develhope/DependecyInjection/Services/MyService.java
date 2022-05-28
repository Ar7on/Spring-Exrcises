package it.develhope.DependecyInjection.Services;

import it.develhope.DependecyInjection.Components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
        System.out.println("my Service name is: " + getName());
    }

    public String getName() {
        return myComponent.getMyComponentName();
    }
}
