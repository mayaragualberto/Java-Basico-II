public class Exercicio09Fibonacci {

    public static void main(String[] args) {

        int numero,numero_ant, qtd_numeros;


        for (numero_ant=0, numero=1, qtd_numeros=0; qtd_numeros<10; numero+=numero_ant,numero_ant=numero-numero_ant, qtd_numeros=qtd_numeros+1) {
            System.out.printf("%d ",numero);
        }  
        System.out.print("");
    }
}