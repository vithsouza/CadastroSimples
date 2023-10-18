/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */

//Nome:Vithoria Cabreira - RA 2410400

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    
    private Motor motor;
    private String dataCadastro;
    
    //metodo não implementado -> implementar na classe filha
    public abstract int calcVel();
    //metodo construtor
    public Veiculo(){
        placa = "";
        marca = "";
        modelo = "";
        cor = "";
        qtdRodas = 0;
        velocMax = 0;
        
    }

    public Veiculo(Motor motor, String dataCadastro) {
        this.motor = motor;
        this.dataCadastro = dataCadastro;
    }

    //getter e setter
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public int getQtdRodas(){
        return qtdRodas;
    }
    public int getVelocMax(){
        return velocMax;
    }
    
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public void setVelocMax(int velocMax) {
        if( velocMax >= 10 && velocMax <= 250 ){
            this.velocMax = velocMax;
        }
        else{
            System.out.println("A velocidade está fora dos limites brasileiros");
            this.velocMax = 100;
            
        }
   
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }
    
   
}
