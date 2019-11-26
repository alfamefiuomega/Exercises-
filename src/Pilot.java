import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Pilot {
    Map<String, Button> buttons;

    //tutaj masz konstruktor
    public void Pilot() {
        this.buttons = createButtons();
    }
    public int MuteButton(){
        int lol;
    }

    // tutaj w przysżłości fajnie skorzystać z design pattern FactoryConfigurationError
    private Map<String, Button> createButtons() {
        Map<String, Button> buttons = new HashMap<>();
        Button muteButton = new MuteButton();

        return buttons;
    }


}