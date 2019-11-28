public class ScrollButton extends Button {
    private int programNumber;
    private Integer canal;
    private boolean programUP = true;

    public int getProgramNumber() {
        return programNumber;
    }

    public void setProgramNumber(int programNumber) {
        this.programNumber = programNumber;
    }

    public void programUP() {
        setProgramNumber(getProgramNumber() + 1);
    }

    public void programDOWN() {
        setProgramNumber(getProgramNumber() - 1);
    }


    @Override
    public <T> T onClick() {
        if (programUP) {
            programUP();
        } else {
            programDOWN();
        }
        {
            return (T) canal;
        }
    }
}
