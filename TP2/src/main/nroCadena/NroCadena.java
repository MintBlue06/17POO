package main.nroCadena;

public class NroCadena {
    public static void main(String[] args) {

        String cadena = "1234";

        int largoCadena = cadena.length();

        int nroRepeticion = (largoCadena * 2) - 1;

        double sumaCadena = 0;

        do {
            short i = 1;

            short j = 1;

            short k = 2 ;

            if (largoCadena >= i) {

                sumaCadena += Integer.parseInt( cadena.substring( i));

                nroRepeticion--;

                i++;
            }
            if (largoCadena < i && nroRepeticion != 1) {
                
                sumaCadena += Integer.parseInt( cadena.substring(j,k));

                nroRepeticion--;

                j++;

                k++;
            }
            if (nroRepeticion == 1) {

                sumaCadena += Integer.parseInt(cadena);

                nroRepeticion--;
            }
        } while (nroRepeticion > 0);

        int resultado = (int) (sumaCadena % 1000000007);

        System.out.println("La suma de las sub cadenas es: " + sumaCadena);

        System.out.println("El resultado es: " + resultado);
    }

}
