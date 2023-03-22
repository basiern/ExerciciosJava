import java.util.Scanner;

public class VetorConsoante {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = entrada.next();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                quantConsoantes++;
                }

                count++;

        } while(count<consoantes.length);

        for (String consoante : consoantes) {
            System.out.println(consoante);            
        }




    }
}
