public class VerificaConceito {

    public static void main(String[]args) {

        char conceito;

        System.out.print("Conceito do aluno: ");

        conceito=System.console().readLine().charAt(0);

        if(conceito!='A'&&conceito!='B'&&conceito!='C')
            System.out.println("Conceito Invalido");
        
        if (conceito=='A'||conceito=='B')
            System.out.println("Aluno aprovado");

        if(conceito=='C')
            System.out.println("Aluno reprovado");
    }
}