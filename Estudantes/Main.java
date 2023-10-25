import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Entre com as informações do Estudante");
        System.out.println("Nome:");
        estudante.nome = sc.nextLine();
        System.out.println("Nota1: ");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Nota2: ");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Nota3: ");
        estudante.nota3 = sc.nextDouble();
        System.out.printf("Nota Final: %.2f%n",estudante.notaFinal());

        if (estudante.notaFinal() < 70.0) {
            System.out.println("Aluno Reprovado");
            System.out.printf("Faltam %.2f pontos%n", estudante.verificacao());
        }else {
                System.out.println("Aluno Aprovado!");
            }



    }

}
