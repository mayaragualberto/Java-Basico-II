public class Exercicio02Detran {

    public static void main(String[] args) {

        int numero_placa;

        String mes;

        System.out.print("Informe o número da placa: ");
        numero_placa=Integer.parseInt(System.console().readLine());

        numero_placa = numero_placa%10;
        mes="A";

        switch(numero_placa) {
            case 0: mes="Janeiro"; break;
            case 1: mes="Fevereiro"; break;
            case 2: mes="Março"; break;
            case 3: mes="Abril"; break;
            case 4: mes="Maio"; break;
            case 5: mes="Junho"; break;
            case 6: mes="Setembro"; break;
            case 7: mes="Outubro"; break;
            case 8: mes="Novembro"; break;
            case 9: mes="Dezembro"; break;
        }

        if (numero_placa<6)
            System.out.printf("Deve realizar a vistoria em %s do próximo mês.\n",mes);

        else
            System.out.printf("Deve realizar a vistoria em %s deste ano.\n", mes);

    }
}