public class Exercicio05 {
    
    public static void main(String[] args) {

    double media, qtdlitros, distancia, somalitros, somadistancia; 
    
    int viagens;

    somalitros=0;
    somadistancia=0;

    System.out.print("Informe a quantidade de viagens: ");
    viagens=Integer.parseInt(System.console().readLine());

    while (viagens>0) {
        System.out.print("Informa a quantidade de litros: ");
        qtdlitros=Double.parseDouble(System.console().readLine());
        somalitros=somalitros+qtdlitros;
        System.out.print("Informa a distância percorrida: ");
        distancia=Double.parseDouble(System.console().readLine());
        somadistancia=somadistancia+distancia;     
        viagens=viagens-1;
    }
    media=somadistancia/somalitros;

    System.out.printf("O consumo médio do carro é igual a %.2f Km/L.\n",media);

    }
}
