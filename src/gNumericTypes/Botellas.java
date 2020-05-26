package gNumericTypes;

import libs.Input;

public class Botellas {

    public static void main(String[] args) {
        int minutos = get_positive_int();
        int litros = minutos*12;
        System.out.println("Tiraste: " + litros + " litros de agua. AHORRA MAS!");
    }

    public static int get_positive_int()
    {
        int n;
        do
        {
            System.out.print("Cuantos minutos te tardas bañandote?");
            n = Input.get_int();
        }
        while (n <= 0);
        return n;
    }


}
