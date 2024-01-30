/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Diego Filipe
 */
public class Turma {
    private String idProfessor;
    private String nomeTurma;
    private String sala;
    private Aluno[] alunos;
    private Professor professor;
    private int numAlunos; // Rastreia o número atual de alunos na turma
     

 
    // Método para obter lista de alunos na turma
    public Aluno[] getAlunos() {
        return alunos;
    }

    // Método para obter professor da turma
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @return the nomeTurma
     */
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * @param nomeTurma the nomeTurma to set
     */
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * @return the idProfessor
     */
    public String getIdProfessor() {
        return idProfessor;
    }

    /**
     * @param idProfessor the idProfessor to set
     */
    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }
}

