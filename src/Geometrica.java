public class Geometrica implements ICalcMedia{
    @Override
    public double calcularMedia(double a, double b) {
        return Math.sqrt(a * b);
    }

    @Override
    public String verificarSituacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}

