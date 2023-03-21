import java.util.Scanner;

public class PareseImpares {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0, count = 0;

        System.out.println("Escreva a quantidade de números que deseja: ");
        quantNumeros = scan.nextInt();

        do{
           
            System.out.println("Escreva um número:");
            numero = scan.nextInt();
            
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
            
            count++;

        } while(count < quantNumeros);

        System.out.println("A quantidade de pares é: " + quantPares + "\nA quantidade de ímpares é: " + quantImpares);

    }
}