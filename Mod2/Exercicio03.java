public class Exercicio03 {
    
    public static void main(String[] args) {

        int n, quadrado, cont;

        System.out.print("Informe o número: ");
        n=Integer.parseInt(System.console().readLine());

        while (n>=0){
            quadrado=n*n;
            System.out.printf("O quadrado do número %d é %d.\n",n,quadrado);
            System.out.print("Informe o número: ");
            n=Integer.parseInt(System.console().readLine());
        }
    }
}
