package pixel.academy.setter_injection_app.common;

import org.springframework.http.converter.json.GsonBuilderUtils;

 class TurkishChef {
     public TurkishChef() {
         System.out.println("In constructor:" + getClass().getSimpleName());
     }

}
