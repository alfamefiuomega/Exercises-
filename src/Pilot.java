import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Pilot {
    @SuppressWarnings("WeakerAccess")
    Map<String, Button> buttons;

    public Pilot() {
        this.buttons = createButtons();
    }

    public Map<String, Button> getButtons() {
        return buttons;
    }

    private Map<String, Button> createButtons() {
        Map<String, Button> buttons = new HashMap<>();

        //TODO: wrzuć do mapy button'ów jakieś buttony ;)
        Button muteButton = new MuteButton();
        Button scrollButton = new ScrollButton();
        Button onOffButton = new OnOffButton();
        Button chanelButton1 = new ChanelButton();
        Button chanelButton2 = new ChanelButton();
        Button chanelButton3 = new ChanelButton();

        buttons.put("mute", muteButton);
        buttons.put("scroll", scrollButton);
        buttons.put("onOff", onOffButton);
        buttons.put("1", chanelButton1);
        buttons.put("2", chanelButton2);
        buttons.put("3", chanelButton3);

        return buttons;
    }


    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.buttons = pilot.createButtons();


    }
}