public class DataTest {
    int dia;
    int mes;
    int ano;

    public DataTest(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterData() {
        String formato = "%d/%d/%d";
        return String.format(formato, this.dia, this.mes, this.ano);
    }
}
