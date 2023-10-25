import java.sql.Struct;

public class Funcionario {

    String nome;
    double salario;
    double imposto;

    double salarioLiquido() {
        return salario - imposto;
    }
    void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100 ;
    }
    public String toString() {
        return "Nome: " + nome+ ';' + "\n Salario R$" + String.format("%.2f", salarioLiquido() );
    }
}
