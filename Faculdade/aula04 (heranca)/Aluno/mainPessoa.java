package Aluno;

public class mainPessoa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "123.456.789-00", "2023001");
        Professor professor1 = new Professor("Dr. Silva", "987.654.321-00", 20, "Matemática");

        System.out.println(
                "Aluno: " + aluno1.getNome() + ", CPF: " + aluno1.getCpf() + ", Matrícula: " + aluno1.getMatricula());
        aluno1.exercitar();

        System.out.println("Professor: " + professor1.getNome() + ", CPF: " + professor1.getCpf() + ", Carga Horária: "
                + professor1.getCargaHoraria() + ", Disciplina: " + professor1.getDisciplina());
        professor1.ensinar();
    }
}
