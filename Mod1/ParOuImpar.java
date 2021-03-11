public class ParOuImpar {
    
    public static void main(String[] args) {

        int n;

        System.out.print("Digite o número desejado: ");

        n=Integer.parseInt(System.console().readLine());

        if (n%2 == 0)
            System.out.println("O número é par");

        else
            System.out.println("O número é ímpar");
    }
}
