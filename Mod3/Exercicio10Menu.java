public class Exercicio10Menu {

    public static void main(String[] args) {

        int opcao, n1, n2, soma, quadrado;

        System.out.print("Menu de Opções: \n1.Somar dois números.\n2.Número ao quadrado\nDigite a opção desejada: ");
        opcao=Integer.parseInt(System.console().readLine());

        switch (opcao) {
            case 1: 
                System.out.print("Informe o primeiro número: ");
                n1=Integer.parseInt(System.console().readLine());
                System.out.print("Informe o segundo número: ");
                n2=Integer.parseInt(System.console().readLine());
                System.out.printf("A soma dos dois números é %d.\n",n1+n2);
                break;
            case 2: 
                System.out.print("Informe o número: ");
                n1=Integer.parseInt(System.console().readLine());
                System.out.printf("O quadrado do número %d é %d.\n",n1,n1*n1);
                break;
        }
    }
}