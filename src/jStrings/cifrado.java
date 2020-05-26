package jStrings;

import libs.Input;

public class cifrado {

    public static void main(String[] args) {
        System.out.println("Dame una palabra:");
        String palabra = Input.get_string();

        for(int i=0; i< palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if(caracter != 32) {
                if(caracter >= 65 && caracter <=90) {
                    int suma = caracter + 12;
                    if(suma > 90) {
                        suma = suma -26;
                    }
                    System.out.print((char) suma);
                } else {
                    System.out.println("Palabra invalida, solo puedes convertir Mayusculas");
                    break;
                }
            } else {
                System.out.print(caracter);
            }

        }

    }

}
