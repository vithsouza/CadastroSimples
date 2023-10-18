/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */

//Nome:Vithoria Cabreira - RA 2410400
public class TestVeic {
    
     
      
    public static void main(String arg[]){
       Leitura l = new Leitura();
       Carga c1 = new Carga();
       Passeio p1 = new Passeio();
 
     
       
      
       
       
       c1.setTara(Integer.parseInt(l.entDados("\n Tara:  ")));
       c1.setCargaMax(Integer.parseInt(l.entDados("\n Carga Maxima:  ")));
       c1.calcular();
       
       
       p1.setVelocMax(Integer.parseInt(l.entDados("Velocidade maxima:  ")));
       p1.setQtdePassageiros(Integer.parseInt(l.entDados("\nQtd de passageiros:  ")));
       p1.setPlaca(l.entDados("\nPlaca:  "));
       p1.setMarca(l.entDados("\nMarca:  "));
       p1.setModelo(l.entDados("\nModelo:  "));
       p1.setCor(l.entDados("\nCor:  "));
       p1.setDataCadastro(l.entDados("\nData de cadastro:  "));
       p1.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas:  ")));
       p1.calcular();


       int qtdPistoes = Integer.parseInt((l.entDados("\nQtd Pistoes:  ")));
       int potencia = Integer.parseInt((l.entDados("\nPotencia:  ")));
       Motor motor = new Motor(qtdPistoes, potencia );
       
       p1.setMotor(motor);
       
       System.out.println("Palca: "+p1.getPlaca());
       System.out.println("Marca: "+p1.getMarca());
       System.out.println("Modelo: "+p1.getModelo());
       System.out.println("Cor: "+p1.getCor());
       System.out.println("Qtd de Rodas: "+p1.getQtdRodas());
       System.out.println("Data de cadastro:  "+p1.getDataCadastro());
       System.out.println("Quatidade de char: "+p1.calcular());
      
       System.out.println("Tara: "+c1.getTara());
       System.out.println("Carga Maxima: "+c1.getCargaMax());
       System.out.println("Quatidade de num: "+c1.calcular());
      
       
       System.out.println(c1.calcVel());
        
    }
}
