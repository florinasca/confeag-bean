package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component   // asa spun ca e obiect
public class ItalianChef implements Chef {

    public ItalianChef() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
    }

    @Override
    public String getDeyliRecipe() {
        return "";
    }


}