public class Exercicio07Quadrados2 {
    
    public static void main(String[] args) {

        int n, quadrado;

        n=15;

        do {
            quadrado = n*n;
            System.out.printf("O quadrado do número %d é %d.\n",n, quadrado);
            n=n+1;
        }while (n<=200);
    }
}
