package phones;

import java.util.Random;

/*
 * create the the main methods name TestClient
 */

public class TestClient {

    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("Model 500", new Dimension(143, 208, 119), Voltage.V110);
        PushButtomPhone pushButtomPhone = new PushButtomPhone("Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL);
        SmartPhone smartPhone1 = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
        SmartPhone smartPhone2 = new SmartPhone("iPhone8", new Dimension(138.4, 67.3, 7.3), 64);

        System.out.println("Various Phones: ");
        System.out.println(rotaryPhone.toString());
        System.out.println(pushButtomPhone.toString());
        System.out.println(smartPhone1.toString());
        System.out.println(smartPhone2.toString());
        System.out.println();

        // Plug both phones in
        rotaryPhone.plugIn();
        pushButtomPhone.plugIn();

        // Randomly select and unplug one of the desk phones
        DeskPhone[] deskPhones = {rotaryPhone, pushButtomPhone};
        Random random = new Random();
        int randomIndex = random.nextInt(deskPhones.length);
        deskPhones[randomIndex].unplug();

        // Create an array of type Phone
        Phone[] phones = {rotaryPhone, pushButtomPhone, smartPhone1, smartPhone2};

        System.out.println("Array Elements:");
        for (Phone phone : phones) {
            System.out.println(phone.toString());

            // Make a call to the number 8019574111 and print the result
            long phoneNumber = 8019574111L;
            System.out.println(phone.call(phoneNumber));

            // Determine whether the current phone is a SmartPhone
            if (phone instanceof SmartPhone) {
                SmartPhone currentSmartPhone = (SmartPhone) phone;
                

                // Browse and take a picture if it's a SmartPhone
                System.out.println(currentSmartPhone.browse());
                System.out.println(currentSmartPhone.takePicture());
            }

            System.out.println();
        }
    }
}
