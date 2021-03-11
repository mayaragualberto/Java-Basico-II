public class Exercicio07 {
    
    public static void main(String[] args) {

        int n, quadrado;

        n=15;

        while (n<=200) {
            quadrado = n*n;
            System.out.printf("O quadrado do número %d é %d.\n",n, quadrado);
            n=n+1;
        }
    }
}
