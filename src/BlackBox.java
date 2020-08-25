import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;



public class BlackBox {


    public static void main(String[] args) throws IOException {
        Brightness();
    }

    public static void Brightness() throws IOException {

        //Scanner
        Scanner kb = new Scanner(System.in);

        int brightness;

        //ask want the user wants to do with brightness
        System.out.println("what level of brightness between 0 and 100 would you like? type a number between 0 and 100 and then press 'Enter'");
        brightness = kb.nextInt();

        if (brightness <= 100 && brightness >= 0) {
            BrightnessManager.setBrightness(new int[]{brightness});
        } else {
            System.out.println("That is not a valible number");
        }
        Brightness();
    }
}
