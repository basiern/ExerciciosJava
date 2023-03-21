import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
     
        System.out.println("De qual número você deseja calcular a tabuada? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de" + tabuada);

        for(int i = 1; i <= 10; i = i+1){
            int resultado = i*tabuada;
            System.out.println(i + " x " + tabuada + " = " + resultado);
        }
    }

}
