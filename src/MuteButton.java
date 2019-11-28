public class MuteButton extends Button {

   private Boolean muteOnOff = false;


    @Override
    public <T> T onClick() {
        muteOnOff =!muteOnOff;

        return (T) muteOnOff;
    }
}



