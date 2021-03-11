public class Exercicio04 {
    
    public static void main(String[] args) {

        double A, B, C;

        System.out.print("Digite o lado A: ");
        A=Double.parseDouble(System.console().readLine());

        System.out.print("Digite o lado B: ");
        B=Double.parseDouble(System.console().readLine());

        System.out.print("Digite o lado C: ");
        C=Double.parseDouble(System.console().readLine());


        if ((A+B)>C || (A+C)>B || (C+B)>A)
            System.out.println("Os lados formam um triângulo.");

        else
            System.out.println("Os valores informados não podem formar um triângulo.");

    }
}
