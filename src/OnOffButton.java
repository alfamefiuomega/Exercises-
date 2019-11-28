public class OnOffButton extends Button {

   private Boolean onOff = false;



    @Override
    public <T> T onClick() {
        onOff=!onOff;

        return (T) onOff;
    }
}
