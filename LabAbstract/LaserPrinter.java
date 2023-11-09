package LabAbstract;

public class LaserPrinter extends Printer {
    private int remainingToner;

    public LaserPrinter(String model) {
        super(model);
        remainingToner = 100; // Start with 100% toner
    }

    public int getRemainingToner() {
        return remainingToner;
    }

    public void refillToner() {
        remainingToner = 100;
    }

    public void print() {
        if (remainingToner > 0) {
            System.out.println(getModel() + " is printing. Remaining toner: " + remainingToner + "%");
            remainingToner -= 10;
        } else {
            System.out.println("The toner is empty.");
        }
    }
}
