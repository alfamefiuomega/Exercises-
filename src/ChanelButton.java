public class ChanelButton extends Button {
    private int programNumber;
    private Integer canal;


    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }


    @Override
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
        {
            return (T) canal;
        }
    }
}