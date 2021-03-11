public class Exercicio04Idade {
    
    public static void main(String[] args) {

        int idade, media, qtd, soma;

        System.out.print("Informe a idade: ");
        idade=Integer.parseInt(System.console().readLine());

        soma=idade;
        qtd=0;

        do {
            System.out.print("Informe a idade: ");
            idade=Integer.parseInt(System.console().readLine());
            soma=soma+idade;
            qtd=qtd+1;
            
        } while (idade>0);
        media=soma/qtd;

        System.out.printf("A média das idades digitadas é %d.\n",media);
    }
}
