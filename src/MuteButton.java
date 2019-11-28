public class MuteButton extends Button {


    Boolean muteOnOff = false;

    public Boolean getMuteOnOff() {
        return muteOnOff;
    }

    public void setMuteOnOff(Boolean muteOnOff) {
        this.muteOnOff = muteOnOff;
    }


    @Override
    public <T> T onClick() {
        muteOnOff =!muteOnOff;
        setMuteOnOff(muteOnOff);
        return (T) getMuteOnOff();
    }
}



