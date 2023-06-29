import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10:");
        int nota = scan.nextInt();

        while(nota<0 || nota>10){
            System.out.println("Nota inválida, você deve digitar um número de 0 a 10. Digite novamente:");
            nota = scan.nextInt();
        } 
            System.out.println("Ok, sua nota é " + nota);
               
    }
}