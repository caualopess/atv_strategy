public class Main {
    public static void main(String[] args) {
        Aritmetica calculoAritmetica = new Aritmetica();
        Disciplina disciplina = new Disciplina(calculoAritmetica);
        disciplina.setNome("Padrões de Desenvolvimento");
        disciplina.setP1(10);
        disciplina.setP2(5);
        disciplina.CalcularMedia();

        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situação: %s",
                disciplina.getP1(), disciplina.getP2(), disciplina.getMedia(), disciplina.getSituacao()));

        Geometrica calculoGeometrica = new Geometrica();
        Disciplina disciplina2 = new Disciplina(calculoGeometrica);
        disciplina2.setP1(10);
        disciplina2.setP2(5);
        disciplina2.CalcularMedia();

        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situação: %s",
                disciplina2.getP1(), disciplina2.getP2(), disciplina2.getMedia(), disciplina2.getSituacao()));
    }
}
