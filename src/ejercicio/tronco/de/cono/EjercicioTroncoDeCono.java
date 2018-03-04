/*
 * EJERCICIO 3 Tronco del Cono
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */
package ejercicio.tronco.de.cono;

/**
 *Ejercicio 3
 * @author YROMERO
 */
import java.util.Scanner;

public class EjercicioTroncoDeCono {

//Proceso inicial

    //Ingreso de Varables 
    
    static double Area(double Radio){
     
        double S=0;
        
        S=Math.PI*Math.pow(Radio, 2);
                    
        return S;
        
    }
    
    static double Radio(double rad, double altura1, double altura2){
     
        double y = rad;
        double x = altura1;
        double aRad = Math.atan2(y, x);
        double Rd= (altura2*Math.sin(aRad))/Math.cos(aRad);   
        
        return Rd;
        
    }
    
    static double VolumenP(double sup1,double sup2,double altura){
     
        double V=0;
        double Res=0;
        Res=(sup1*sup2);
        Res=Math.sqrt(Res);
        V=(altura*(sup1+sup2+Res))/3;
             
        return V;
        
    }
    
    static double VolumenT(double radio, double altura){
     
        double V=0;
        double Res=0;
        Res=Math.PI*Math.pow(radio, 2)*altura;
        V=Res/3;
             
        return V;
        
    }
    
    
    public static void main(String[] args) {
        
        
       double R1;
       double h1;
       double h2;
    
    //Proceso Final
    
       
       Scanner Teclado= new Scanner (System.in);
    
    //Entrada Inicial 
    
       System.out.println("Ingrese el radio del cono ");
       R1 = Teclado.nextFloat();
       System.out.println("Ingrese la altura del cono ");
       h1 = Teclado.nextFloat();
       System.out.println("Ingrese la altura del cono pequeño ");
       h2 = Teclado.nextFloat();
       
    //Entrada Final
     
    
      //Variables a Calcular 
      
       double S1= Area(R1);
       double R2= Radio(R1,h1,h2);
       double S2= Area(R2);
       double H=h1-h2;
     
    //Salida Inicial
    
       System.out.println("Radio inferior: " +R1);
       System.out.println("Radio Superior: " +R2);   
       System.out.println("Area inferior: " +S1);
       System.out.println("Area superior: " +S2);
       System.out.println("Volumen Tronco: " +VolumenP(S1,S2,H));
       System.out.println("Volumen Total: " +VolumenT(R1,h1));
       
    //Salida Final
    }
    
}