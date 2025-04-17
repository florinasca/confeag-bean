package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

public class FrenchChef {

    public FrenchChef() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Component
    public class MexicanChef implements Chef {
        @Override
        public String getDailyRecipe() {
            return "";
        }

        @Override
        public String getDeyliRecipe() {


            String getDailyRecipe; {
                return "Prepara un kebab cu carne de miel , servit cu pilaf si orez! ";
            }
        }
    }
}