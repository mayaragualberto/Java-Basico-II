public class Exercicio09 {
    
    public static void main(String[] args) {

        double salario, salfinal;

        System.out.print("Informe o valor do salário: ");
        salario=Double.parseDouble(System.console().readLine());

        if (salario < 5000) {
            salfinal=salario*1.30;
            System.out.printf("O salário reajustado é: R$ %.2f.\n", salfinal);
        }

        else {
            System.out.printf("O salário não tem reajuste.");
        }

    }
}
