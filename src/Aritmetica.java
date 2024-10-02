public class Aritmetica implements ICalcMedia{
    @Override
    public double calcularMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}

