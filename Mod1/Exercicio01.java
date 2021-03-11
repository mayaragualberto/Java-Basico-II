public class Exercicio01 {

    public static void main(String[] args) {

        int n1,n2,diferenca;

        System.out.print("Digite o primeiro número: ");

        n1=Integer.parseInt(System.console().readLine());

        System.out.print("Digite o segundo número: ");

        n2=Integer.parseInt(System.console().readLine());

        if (n1>n2) {
            diferenca = n1-n2;
            System.out.printf("A diferença é: %d\n",diferenca);
        }
        
        if (n2>n1) {
            diferenca = n2-n1;
            System.out.printf("A diferença é: %d\n",diferenca);
        }
        if (n1==n2)
            System.out.println("0");
    }
    
}
