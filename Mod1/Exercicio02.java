public class Exercicio02 {
    
    public static void main(String[] args) {

        int n;

        System.out.print("Digite um valor numérico inteiro: ");
        n=Integer.parseInt(System.console().readLine());

        if (1 < n && n < 9)
            System.out.println("O valor está na faixa permitida");

        else
            System.out.println("O valor está fora da faixa permitida");
    }
}
