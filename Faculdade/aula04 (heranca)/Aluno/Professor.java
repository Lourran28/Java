package Aluno;

public class Professor extends Pessoa {
    private int cargaHoraria;
    private String disciplina;

    public Professor(String nome, String cpf, int cargaHoraria, String disciplina) {
        super(nome, cpf);
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println(this.nome + " está ensinando a disciplina de " + this.disciplina + ".");
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
