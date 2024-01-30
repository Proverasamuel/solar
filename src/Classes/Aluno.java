/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Diego Filipe
 */
public class Aluno extends Pessoa {
   private int numeroProcesso;
   private double notas;
   private Encarregado encarregado;
    private String classe;
    private String turma;

    /**
     * @return the numeroProcesso
     */
    public int getNumeroProcesso() {
        return numeroProcesso;
    }

    /**
     * @param numeroProcesso the numeroProcesso to set
     */
    public void setNumeroProcesso(int numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    /**
     * @return the notas
     */
    public double getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double notas) {
        this.notas = notas;
    }

    /**
     * @return the encarregado
     */
    public Encarregado getEncarregado() {
        return encarregado;
    }

    /**
     * @param encarregado the encarregado to set
     */
    public void setEncarregado(Encarregado encarregado) {
        this.encarregado = encarregado;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }
   
}
