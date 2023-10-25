import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario =  new Funcionario();
        System.out.println("Informe os dados:");
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Informe o salário bruto: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("Informe o valor do imposto :");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();
        System.out.println("Informe a porcentagem de aumento: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println();
        System.out.println("Dados Atualizados: " + funcionario );
    }
}
