package pixel.academy.setter_injection_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.setter_injection_app.common.Chef;

@RestController
public class DemoController {

    // constructor injection
    @Autowired
    public DemoController( @Qualifier("italianChef") Chef theChef ) {
    }


    // setter injection
//    @Autowired
//    public void setMyChef(Chef theChef) {
//        myChef = theChef;
//    }







}
