/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vendedores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Oscar
 */
public class Pro1 {
    
    public static void main(String[] args) {
        //Empesamos creeando la lista 
        List<ClsVendedores> misEmp = new ArrayList();
        
        
        Random dato = new Random();
        int z = 0, z1 = 0,z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0, z7 = 0, z8 = 0;
        int z9 = 0, z10 = 0, z11 = 0, z12 = 0, z13 = 0, z14 = 0, z15 = 0, z16 = 0, z17 = 0;
        int z18 = 0, z19 = 0, z20 = 0, z21 = 0, z22 = 0, z23 = 0;
        
        for(int i =0; i<1; i++){
            z=dato.nextInt(900); z1=dato.nextInt(600); z2=dato.nextInt(700);
            z3=dato.nextInt(900); z4=dato.nextInt(600); z5=dato.nextInt(700);
            z6=dato.nextInt(900); z7=dato.nextInt(600); z8=dato.nextInt(700);
            z9=dato.nextInt(900); z10=dato.nextInt(600); z11=dato.nextInt(700);
            z12=dato.nextInt(900); z13=dato.nextInt(600); z14=dato.nextInt(700);
            z15=dato.nextInt(900); z16=dato.nextInt(600); z17=dato.nextInt(700);
            z18=dato.nextInt(900); z19=dato.nextInt(600); z20=dato.nextInt(700);
            z21=dato.nextInt(900); z22=dato.nextInt(600); z23=dato.nextInt(700);

            
        }
        
        ClsVendedores ven = new ClsVendedores("1-Oscar");
        ven.setEnero(z);
        ven.setFebrero(z1);
        ven.setMarzo(z2);
        misEmp.add(ven);
            
        ven=new ClsVendedores("2-Lemus");
        ven.setEnero(z3);
        ven.setFebrero(z4);
        ven.setMarzo(z5);
        misEmp.add(ven);
 
        ven = new ClsVendedores("3-Daniela");
        ven.setEnero(z6);
        ven.setFebrero(z7);
        ven.setMarzo(z8);
        misEmp.add(ven);
        
        ven = new ClsVendedores("4-Jose");
        ven.setEnero(z9);
        ven.setFebrero(z10);
        ven.setMarzo(z11);
        misEmp.add(ven);
        
        ven = new ClsVendedores("5-Marco");
        ven.setEnero(z12);
        ven.setFebrero(z13);
        ven.setMarzo(z14);
        misEmp.add(ven);
        
        ven = new ClsVendedores("6-Corado");
        ven.setEnero(z15);
        ven.setFebrero(z16);
        ven.setMarzo(z17);
        misEmp.add(ven);
        
        ven = new ClsVendedores("7-Rudy");
        ven.setEnero(z18);
        ven.setFebrero(z19);
        ven.setMarzo(z20);
        misEmp.add(ven);
        
        ven = new ClsVendedores("8-Gaby");
        ven.setEnero(z21);
        ven.setFebrero(z22);
        ven.setMarzo(z23);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
         
        double sumaEnero = 0;  
        double sumaFebrero = 0;
        double sumaMarzo = 0;   
        double SumasMesesTotal = 0;
        
        System.out.println("Vendedores");//Imprime Vendedores 
        System.out.println("-----------");
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));
        
        
        for (ClsVendedores v : misEmp){
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            
            SumasMesesTotal= sumaEnero+sumaFebrero+sumaMarzo;
        }
        //Impresion de la tabal y losdatos  vendedores 
        System.out.println("\n\t-------------------------------------------------------------------");
        System.out.println("\n\tNOMBRE\t\t |    ENERO\t\t        |  FEBRERO\t        |  MARZO");
        System.out.println("\t1-Oscar\t         |   "+z+"\t\t        |  "+z1+"\t\t       |  "+z2);
        System.out.println("\t2-Lemus\t\t |   "+z3+"\t\t        |  "+z4+"\t\t       |  "+z5);
        System.out.println("\t3-Daniela\t |   "+z6+"\t\t        |  "+z7+"\t\t       |  "+z8);
        System.out.println("\t4-Jose\t\t |   "+z9+"\t\t      |  "+z10+"\t\t      |  "+z11);
        System.out.println("\t5-Marco\t\t |   "+z12+"\t\t      |  "+z13+"\t\t        |  "+z14);
        System.out.println("\t6-Corado\t |   "+z15+"\t\t      |  "+z16+"\t\t      |  "+z17);
        System.out.println("\t7-Rudy\t         |   "+z18+"\t\t      |  "+z19+"\t\t      |  "+z20);
        System.out.println("\t8-Gaby\t\t |   "+z21+"\t\t      |  "+z22+"\t\t      |  "+z23);
        System.out.println("\tTOTAL MES\t |   "+sumaEnero+"\t\t |  "+sumaFebrero+"\t| "+sumaMarzo);
        System.out.println("\n\t-------------------------------------------------------------------");
        System.out.println("\n\tVentas Totales Por Todos os Meses = "+SumasMesesTotal);
        System.out.println("\n\t-----------------------------------------------------");
System.out.println("\n\tLa Suma Total De Enero="+sumaEnero);
        System.out.println("\tLa  Suma Total de febrero ="+sumaFebrero);
                   
        System.out.println("\tLa Suma Total De Marzo ="+sumaMarzo);
System.out.println("\n\t------------------------------------------------------------");
    }
    
}

    

