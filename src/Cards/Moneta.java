package Cards;

import java.util.Random;

public class Moneta {
    private String stronadogory;
    Random moneta = new Random();

    public Moneta() {
        int rg;
        rg = moneta.nextInt(2);
        if (rg == 0) {
            stronadogory = "Reszka";
        } else
            stronadogory = "Orzel";
    }

    public void podrzucenie() {
        int rg;
        rg = moneta.nextInt(2);

        if (rg == 0) {
            stronadogory = "Reszka";
        } else
            stronadogory = "Orzel";
    }

    public String getstronadogory() {

        return stronadogory;
    }
}