public class OnOffButton extends Button {

    Boolean onOff = false;

    public Boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        this.onOff = onOff;
    }


    @Override
    public <T> T onClick() {
        onOff=!onOff;
        setOnOff(onOff);
        return (T) getOnOff();
    }
}
