package LabAbstract;

public class PrinterApp {
    public static void main(String[] args) {
        Printer[] printers = new Printer[2];

        printers[0] = new InkjetPrinter("Canon TS202");
        printers[1] = new LaserPrinter("Samsung Xpress");

        for (int i = 0; i < printers.length; i++) {
            System.out.println(printers[i]);

            for (int j = 9; j >= 0; j--) {
                printers[i].print();
            }

            if (i == 0) {
                System.out.println("The cartridge is empty.");
            } else if (i == 1) {
                LaserPrinter laserPrinter = (LaserPrinter) printers[i];
                System.out.println("The toner is empty.");
                laserPrinter.refillToner();
                System.out.println("Remaining toner after refilling: " + laserPrinter.getRemainingToner() + "%");
            }

            if (i == 0) {
                System.out.println(); // Add a newline after InkjetPrinter
            } else {
                System.out.println("Remaining cartridge after refilling: 100%");
            }
        }
    }
}
