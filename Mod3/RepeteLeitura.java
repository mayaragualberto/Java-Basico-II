public class RepeteLeitura {

    public static void main (String[] args) {

        int numero;

        do {

            System.out.print("Digite um número inteiro: ");
            numero=Integer.parseInt(System.console().readLine());

        } while(numero!=8);

        System.out.println("Você acertou o número!");
    }
    
}
