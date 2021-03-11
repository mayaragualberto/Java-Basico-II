public class Exercicio01 {
    
    public static void main(String[] args) {

        double n,  soma;

        int cont;

        cont=0;
        soma=0;

        while (cont<10) {
            System.out.printf("Digite número %d: ",cont+1);
            n=Double.parseDouble(System.console().readLine());
            cont=cont+1;
            soma=soma+n;
        }
        System.out.printf("A soma dos 10 números é: %.2f\n",soma);
    }
}
