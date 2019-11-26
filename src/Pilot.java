import java.util.HashMap;
import java.util.Map;

public class Pilot {
    Map<String, Button> buttons;

    public void Pilot() {
        this.buttons = createButtons();
    }

    private Map<String, Button> createButtons() {
        Map<String, Button> buttons = new HashMap<>();

        //TODO: wrzuć do mapy button'ów jakieś buttony ;)
        Button muteButton = new MuteButton();
        return buttons;
    }


}