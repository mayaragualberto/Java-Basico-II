public class Exercicio02 {
    
    public static void main(String[] args) {

        int cont, qtd, n, somatorio, somaquadrados, media;

        cont=0;
        somatorio=0;
        somaquadrados=0;
        media=0;
        n=1;

        System.out.printf("Informe a quantidade de números: ");
        qtd=Integer.parseInt(System.console().readLine());

        while (cont<qtd) {
            somatorio=somatorio+n;
            somaquadrados=somaquadrados+n*n;
            cont=cont+1;
            n=n+1;
        }
        media=somatorio/qtd;

        System.out.printf("O somatório é %d, a soma dos quadrados é %d e a média é %d.\n", somatorio, somaquadrados, media);
    }
}
