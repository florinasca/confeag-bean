package pixel.academy.setter_injection_app.common;

import jakarta.annotation.PostConstruct;

public class MexicanChe {
    public void MexicanChef() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }
}

//init method
@PostConstruct new*
public void initializeBean() {
    System.out.println("Bean initialized." + getClass().getSimpleName());
}

//destroy method
public void cleanap() {
    System.out.println();
}

