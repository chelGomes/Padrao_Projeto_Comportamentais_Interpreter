public class Banco {
    public static String formula = "parcela1 * 2 + parcela2";

    public static double calcularEmprestimo(double parcela1, double parcela2) {
        String expressao;
        expressao = formula.replace("parcela1", Double.toString(parcela1));
        expressao = expressao.replace("parcela2", Double.toString(parcela2);
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
