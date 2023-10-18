/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author cabre
 */
//Nome:Vithoria Cabreira - RA 2410400


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura {
    public String entDados(String rotulo){
        System.out.println(rotulo);
        
    InputStreamReader teclado = new InputStreamReader(System.in);
    BufferedReader buffTec = new BufferedReader(teclado);

		String resp = "";

		try{
			resp = buffTec.readLine();
		}
		catch(IOException ioe){
			System.out.println("ERRO NA ENTRADA");
		}	
		
		return resp;    
    }
}
