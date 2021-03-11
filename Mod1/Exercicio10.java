public class Exercicio10 {
    
    public static void main(String[] args) {

    double n1, n2, n3, media;
    
    System.out.print("Informe a primeira nota: ");
    n1=Double.parseDouble(System.console().readLine());

    System.out.print("Informe a segunda nota: ");
    n2=Double.parseDouble(System.console().readLine());

    System.out.print("Informe a terceira nota: ");
    n3=Double.parseDouble(System.console().readLine());

    media=(n1*2+n2*3+n3*5)/10;

    if (media>=8 && media<=10)
        System.out.printf("A média ponderada é %.2f e o conceito é A.\n",media);

    if (media>=7 && media<8)
        System.out.printf("A média ponderada é %.2f e o conceito é B.\n",media);

    if (media>=6 && media<7)
        System.out.printf("A média ponderada é %.2f e o conceito é C.\n",media);

    if (media>=5 && media<6)
        System.out.printf("A média ponderada é %.2f e o conceito é D.\n",media);

    if (media>=0 && media<5)
        System.out.printf("A média ponderada é %.2f e o conceito é E.\n", media);
    }
}
