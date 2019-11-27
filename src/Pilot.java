import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Pilot {
    @SuppressWarnings("WeakerAccess")
    Map<String, Button> buttons;

    public Pilot() {
        this.buttons = createButtons();
    }

    private Map<String, Button> createButtons() {
        Map<String, Button> buttons = new HashMap<>();

        //TODO: wrzuć do mapy button'ów jakieś buttony ;)
        Button muteButton = new MuteButton();
        Button scrollButton = new ScrollButton();
        Button onOffButton = new OnOffButton();
        Button chanelButton = new ChanelButton();

        return buttons;
    }

}