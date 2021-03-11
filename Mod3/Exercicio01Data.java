public class Exercicio01Data {

    public static void main(String[] args) {

        int dia, mes, ano;

        String nome_dia, nome_mes, nome_ano;

        System.out.print("Informe o dia: ");
        dia=Integer.parseInt(System.console().readLine());

        System.out.print("Informe o mês: ");
        mes=Integer.parseInt(System.console().readLine());

        System.out.print("Informe o ano: ");
        ano=Integer.parseInt(System.console().readLine());

        nome_mes="A";

        switch(mes){
            case 1: nome_mes = "janeiro"; break;
            case 2: nome_mes = "fevereiro"; break;
            case 3: nome_mes = "março"; break;
            case 4: nome_mes = "abril"; break;
            case 5: nome_mes = "maio"; break;
            case 6: nome_mes = "junho"; break;
            case 7: nome_mes = "julho"; break;
            case 8: nome_mes = "agosto"; break;
            case 9: nome_mes = "setembro"; break;
            case 10: nome_mes = "outubro"; break;
            case 11: nome_mes = "novembro"; break;
            case 12: nome_mes = "dezembro"; break;
        }

        System.out.printf("%d de %s de %d.\n",dia, nome_mes, ano);

    }
}