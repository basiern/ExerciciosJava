import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
       
        int count = 0;
        int numero;
        int maior = 0;
        int soma = 0;

        System.out.println("Vamos calcular a media de 05 numeros. Digite os numeros abaixo.");

        do {

            System.out.println("Numero:");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count++;

        } while(count<5);
 
        System.out.println("O maior numero e: " + maior +"\nE a media e: " + (soma/5));

    }5

}
