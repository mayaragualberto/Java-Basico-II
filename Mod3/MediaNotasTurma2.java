public class MediaNotasTurma2 {

    public static void main(String[] args) {

        int nro_estudantes, soma, nota, notaslidas;

        double media;

        System.out.print("Numero de estudantes da turma: ");
        nro_estudantes=Integer.parseInt(System.console().readLine());

        for(notaslidas=0, soma=0; notaslidas<nro_estudantes; soma=soma+nota, notaslidas=notaslidas+1) {
            System.out.printf("Nota %d: ", notaslidas+1);
            nota=Integer.parseInt(System.console().readLine());    
            
        }

        media = (double)soma/nro_estudantes;
        System.out.printf("Media das notas = %.1f\n", media);
    }
    
}