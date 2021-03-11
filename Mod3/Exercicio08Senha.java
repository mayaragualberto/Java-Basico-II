public class Exercicio08Senha {

    public static void main(String[] args) {

        int senha;

        System.out.print("Informe a senha: ");
        senha=Integer.parseInt(System.console().readLine());

        do {
            System.out.print("Senha incorreta. \nInforme a senha: ");
            senha=Integer.parseInt(System.console().readLine());
        } while(senha!=1234);

        System.out.print("Senha correta, acesso liberado.\n");
    }
}