/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */
//Nome:Vithoria Cabreira - RA 2410400


public class Motor {
    private int qtdPistoes;
    private int potencia;
    
//metodo construtor 

    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }
   

    public int getQtdPistoes() {
        return qtdPistoes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setQtdPistoes(int qtdPistoes) {
        this.qtdPistoes = qtdPistoes;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
