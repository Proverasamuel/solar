/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Administrador
 */
public class ProfessorItem {
    private String id;
    private String nome;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

      public ProfessorItem(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
       @Override
    public String toString() {
        return nome; // Define como os itens são exibidos na ComboBox
    }
}
