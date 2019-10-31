package com.devBootCamp.exercicioHeranca;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("André");
        pessoa.setCpf("123456798");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario");
        funcionario.setCpf("35465498465");
        funcionario.setDataDeAdmissao(LocalDate.now().minusYears(1));
        funcionario.setSalario(BigDecimal.valueOf(1000));
        System.out.println("Funcionário");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cpf: " + funcionario.getCpf());
        System.out.println("Admissão: " + funcionario.getDataDeAdmissao());
        System.out.println("Salário: " + funcionario.calculaSalario());
        System.out.println();

        System.out.println("Aluno: ");
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        aluno.setCpf("35764968435476");

        Curso curso = new Curso(1, "ADS", 4);
        Curso curso1 = new Curso(2, "ADM", 4);

        Integer matricula = aluno.matricularAluno(curso);
        System.out.println(matricula);

        Integer matriculaADM = aluno.matricularAluno(curso1);
        System.out.println(matriculaADM);

        Integer matricula1 = aluno.matricularAluno(curso1);
        System.out.println(matricula1);

        System.out.println("Cursos do Aluno: ");
        for (AlunoCurso alunoCurso : aluno.getCursoList()) {
            System.out.println(alunoCurso.getMatricula());
            System.out.println(alunoCurso.getCurso().getNome());
            System.out.println(alunoCurso.getDataDeInicio());
            System.out.println();
        }

        Professor professor = new Professor();
        professor.setNome("Professor Teste");
        professor.setCpf("13854684");
        professor.setDataDeAdmissao(LocalDate.now());
        professor.setSalario(BigDecimal.valueOf(4000));

        ProfessorCurso professorCurso = new ProfessorCurso();
        professorCurso.setCurso(curso);
        professorCurso.setPercentual(10D);
        professor.getProfessorCursoList().add(professorCurso);

        ProfessorCurso professorCurso2 = new ProfessorCurso();
        professorCurso2.setCurso(curso1);
        professorCurso2.setPercentual(5D);
        professor.getProfessorCursoList().add(professorCurso2);

        System.out.println("Professor");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Cpf: " + professor.getCpf());
        System.out.println("Admissão:" + professor.getDataDeAdmissao());
        System.out.println("Salário: " + professor.calculaSalario());
        System.out.println("Cursos:");
        for (ProfessorCurso professorCurso1 : professor.getProfessorCursoList()) {
            System.out.println("Curso: " + professorCurso1.getCurso().getNome());
            System.out.println("Percentual sobre o curso: " + professorCurso1.getPercentual());
            System.out.println();
        }

    }
}
