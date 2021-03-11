public class Exercicio03 {

    public static void main(String[] args) {

        double A, B, C, delta;

        System.out.print("Digite o valor de A: ");
        A=Double.parseDouble(System.console().readLine());

        System.out.print("Digite o valor de B: ");
        B=Double.parseDouble(System.console().readLine());

        System.out.print("Digite o valor de C: ");
        C=Double.parseDouble(System.console().readLine());

        delta = ((B*B) + 4*A*C);

        if (delta < 0)
            System.out.println("A equação não possui raízes reais.");

        if (delta > 0)
            System.out.println("A equação possui duas raízes reais.");

        if (delta == 0)
            System.out.println("A equação possui uma única raiz real.");
    }
}