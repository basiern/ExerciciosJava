public class VetorInverso {
    public static void main(String[] args) throws Exception {
       
        int[] vetor = {-1, -5 ,15, 50, 8, 4};
        //O tamanho é 6 (seis) em 5 (cinco) posições, vez que a posição começa a contar do 0 (zero)

        System.out.println(vetor);
        //A impressão do array retorna no local da memória onde ele se encontra, não no próprio array

        System.out.println(vetor.length);
        //Aqui se imprime o cumprimento do vetor (quantos elementos cabem nele)
         
        int count = 0;
        while (count <= vetor.length -1){
            System.out.println(vetor[count]);
            count++;
        }

        count = 5;
        while (count > -1){
            System.out.println(vetor[count]);
            count--;
        }



    }
}
