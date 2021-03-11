public class Exercicio05 {
    
    public static void main(String[] args) {

        int n1, n2, n3, n4;

        System.out.print("Digite o primeiro número: ");
        n1=Integer.parseInt(System.console().readLine());

        System.out.print("Digite o segundo número: ");
        n2=Integer.parseInt(System.console().readLine());

        System.out.print("Digite o terceiro número: ");
        n3=Integer.parseInt(System.console().readLine());

        System.out.print("Digite o quarto número: ");
        n4=Integer.parseInt(System.console().readLine());

        if (n1%2==0 || n2%2==0 || n3%2==0 || n4%2==0)
            System.out.println("Os números abaixo são divisíveis por 2:");

        if (n1%2==0)
            System.out.printf("%d\n",n1);

        if (n2%2==0)
            System.out.printf("%d\n",n2);

        if (n3%2==0)
            System.out.printf("%d\n",n3);

        if (n4%2==0)
            System.out.printf("%d\n",n4);

        if (n1%3==0 || n2%3==0 || n3%3==0 || n4%3==0)
            System.out.println("Os números abaixo são divisíveis por 3:");

        if (n1%3==0)
            System.out.printf("%d\n",n1);

        if (n2%3==0)
            System.out.printf("%d\n",n2);

        if (n3%3==0)
            System.out.printf("%d\n",n3);

        if (n4%3==0)
            System.out.printf("%d\n",n4);

    }
}
