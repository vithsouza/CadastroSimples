/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */
//Nome:Vithoria Cabreira - RA 2410400


public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiros;
    
    //metodo da classe mãe
      
    //metodo contrutor
    public Passeio() {
        qtdePassageiros = 0;
    }
    
    //getter e setter

    public  int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public int calcVel() {
      return  getVelocMax() * 1000 ;
    }

    @Override
    public int calcular() {
           int StringSize = 0;
        StringSize = getPlaca().length() + getMarca().length() + getModelo().length()+ getCor().length() + getDataCadastro().length();
        return StringSize;

    }

 }
