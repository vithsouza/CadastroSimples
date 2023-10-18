/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */
//Nome:Vithoria Cabreira - RA 2410400


public class Carga extends Veiculo implements Calc{
    private int tara;
    private int cargaMax;
    
    //metodo contrutor
    public Carga(){
        tara = 0;
        cargaMax = 0;
    }
    
    //getter e setter
    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int calcVel() {
        return getVelocMax() * 100000;
    }

    @Override
    public int calcular() {
          int StringSize= 0 ;
        StringSize =   getTara()+getCargaMax()+ getQtdRodas()+ getVelocMax();
        return StringSize;
    }
    
}
