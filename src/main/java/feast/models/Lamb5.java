package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lamb5 {
    private Goat6 goat6;
    @Autowired
    public void setGoat(Goat6 goat6){
        this.goat6 = goat6;
    }
    @Override
    public String toString() {
        return "which is stuffed inside a goat, " + goat6.toString();
    }
}
