public class Exercicio06 {
    
    public static void main(String[] args) {

        double precounit, precototal, faturamento;

        String nome;

        int qtdmerc, qtd, cont;

        faturamento=0;
        cont=0;

        System.out.print("Informa a quantidade de mercadorias: ");
        qtdmerc=Integer.parseInt(System.console().readLine());

        while (cont<qtdmerc) {
            System.out.print("Informe o nome da mercadoria: ");
            nome=System.console().readLine();
            System.out.print("Informe o preço unitário: ");
            precounit=Double.parseDouble(System.console().readLine());
            System.out.print("Informe a quantidade total vendida no mês: ");
            qtd=Integer.parseInt(System.console().readLine());
            precototal=precounit*qtd;
            faturamento=faturamento+precototal;
            cont=cont+1;
        }

        System.out.printf("O faturamento total mensal é de R$ %.2f.\n",faturamento);
    }
}
