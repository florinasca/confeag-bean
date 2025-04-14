package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

public class FrenchChef {

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