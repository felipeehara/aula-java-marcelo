public class Estudante {

    String nome;
    double nota1;
    double nota2;
    double nota3;

    double notaFinal() {
        return nota1 + nota2 + nota3;
    }
    double verificacao() {
        if (notaFinal() < 70.0) {
            return 70.0 - notaFinal();
        }else {
            return 0.0;
        }
    }

}
