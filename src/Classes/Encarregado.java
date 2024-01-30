/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Diego Filipe
 */
public class Encarregado extends Pessoa {
    private String nomePai;
    private String nomeMae;
    private int telefonePai;
    private int telefoneMae;

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the telefonePai
     */
    public int getTelefonePai() {
        return telefonePai;
    }

    /**
     * @param telefonePai the telefonePai to set
     */
    public void setTelefonePai(int telefonePai) {
        this.telefonePai = telefonePai;
    }

    /**
     * @return the telefoneMae
     */
    public int getTelefoneMae() {
        return telefoneMae;
    }

    /**
     * @param telefoneMae the telefoneMae to set
     */
    public void setTelefoneMae(int telefoneMae) {
        this.telefoneMae = telefoneMae;
    }
}
