public class ChanelButton extends Button {
    int programNumber;

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    @Override
    public <T> T onClick() {
        return null;
    }
}
  /* @Override
    public <T> T onClick() {

        switch (programNumber) {

            case 1: {
                setProgramNumber(1);
                break;
            }
            case 2: {
                setProgramNumber(2);
                break;

            }
            case 3: {
                setProgramNumber(3);
                break;
            }

        }
        return getProgramNumber(); */