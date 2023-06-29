import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Qual o seu nome?");
            String nome = scanner.next();
        
            if(nome.equals("0")) break;

            System.out.println("Certo, " + nome + ". Qual a sua idade?");
            int idade = scanner.nextInt();

            System.out.println("Entendi, seu  nome é " + nome + ". E você tem " + idade + " anos de idade.");

        }

   }
}