import java.util.Scanner;

public class ChanelButton extends Button {

    Scanner scan = new Scanner(System.in);
    Pilot pilot = new Pilot();

    public ChanelButton(int chanel) {
        this.onClick();
    }

    @Override
    public void onClick() {

        switch (scan.nextInt()) {

            case 1: {
                pilot.buttons.get("1");
                System.out.println("1");
            }
            case 2: {
                pilot.buttons.get("2");
                System.out.println("2");
            }
            case 3: {
                pilot.buttons.get("3");
                System.out.println("3");
            }

        }
    }
}
