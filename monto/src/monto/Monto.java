/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Monto {
   // va ser un string n letra donde va tener un parametro entero
    public static String nletra(int numero){       
      String cadena = new String();
      
              
              // si lleva millones....
              
           if((numero/1000000)>  0) 
           {
               if ((numero/1000000)==1)
               {
        cadena = " UN MILLON"+ nletra(numero%1000000);  
                        // quita el primer numero de 1millon osea el 1 me deja el resto
                }
        
               else 
                   
               {
                   cadena =  nletra(numero/1000000)+" MILLONES "+ nletra(numero%1000000);
                         // porque si s 7 millones lo divide queda el 7 
               }
           }
           else    
           {
               // si lleva miles...
                if((numero/1000)>  0) 
                {
                    if ((numero/1000)==  1) 
                    {
                        cadena  = " MIL "+ nletra(numero % 1000);
                }
                
                else  
                {
                    cadena  =   nletra(numero/1000)+" MIL "+ nletra(numero % 1000);
    //si es 7mil dividio entre mil me deja el 7 ...   miil     aca quita el primer numero osea l 7 y pone el resto
           }}
    
               
           else 
           {
                   //si lleva cientos...
                   if ((numero /100)> 0)
                   {
                       
                   
                       if((numero /100)==  1 )
                       {
                           if((numero%100)==0)
                           {
                           cadena = " CIEN ";
                           
                           
                   }         
                       else {
                           cadena = " CIENTO "+ nletra(numero%100);
                                                 // quita el primero numeroq es el 1 y pone las decenas en letras
                       }
                   }
    
                
                else 
                {
                    if((numero /100)== 500)
                    {
                        cadena = "QUINIENTOS "+ nletra(numero%100);
                    }
                        
                   else 
                   {
                           if((numero/100)== 9)
                           {
                           cadena = "NOVESIENTOS "+ nletra(numero%100);
                           }
                           
                           else 
                           {
                             cadena = nletra(numero/100)+  "CIENTOS "+ nletra(numero%100);
                           }
                           
                   }
                }
           }
                    
                   // SI SON DECENAS..
               else
                {
                        if ((numero/10)>0){
                        switch ((int)(numero/10))
                        {
                            case 1: 
                        switch((int)numero%10)
                        {
                        case 0: cadena ="DIEZ";break;
                        case 1: cadena ="ONCE";break;
                        case 2: cadena ="DOCE";break;
                        case 3: cadena ="TRECE";break;
                        case 4: cadena ="CATORCE";break;
                        case 5: cadena ="QUINCE";break;
                        
                        default:
                            cadena = "DIEZ Y"+ nletra(numero%10); break;
                        }
                        break;
                        
                        case 2: 
                         switch((int)numero%10)
                         {
                             case 0: cadena = "VEINTE"; break;                        
                        
                             default:
                                cadena = "VEINTE Y"+nletra(numero%10); break;
                                        
                        }
                        break;
                        case 3: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "TREINTA"; break;
                                
                            default:
                                cadena = "TREINTA Y"+nletra(numero%10); break;
                        }
                        break;    
                        case 4: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "CUARENTA"; break;
                                
                            default:
                                cadena = "CUARENTA Y"+nletra(numero%10); break;
                        }
                        break;
                          case 5: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "CINECUENTA"; break;
                                
                            default:
                                cadena = "CINCUENTA Y"+nletra(numero%10); break;
                        }
                          break;
                              
                           case 6: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "SESENTA"; break;
                                
                            default:
                                cadena = "SESENTA Y"+nletra(numero%10); break;
                        }
                          break;  
                          case 7: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "SETENTA"; break;
                                
                            default:
                                cadena = "SETENTA Y"+nletra(numero%10); break;
                        }
                          break; 
                        
                         case 8: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "OCHENTA"; break;
                                
                            default:
                                cadena = "OCHENTA Y"+nletra(numero%10); break;
                        }
                          break; 
                            case 9: 
                        switch((int)numero%10)
                        {
                            case 0 : cadena = "NOVENTA"; break;
                                
                            default:
                                cadena = "NOVENTA Y"+nletra(numero%10); break;
                        }
                          break;  
                        }}
                        else
                        {
                            switch((int)numero)
                            {
                                case 0 : cadena = "CERO"; break;
                                    case 1 : cadena = "UNO"; break;
                                        case 2 : cadena = "DOS"; break;
                                            case 3 : cadena = "TRES"; break;
                                                case 4 : cadena = "CUATRO"; break;
                                                    case 5 : cadena = "CINCO"; break;
                                                        case 6 : cadena = "SEIS"; break;
                                                            case 7 : cadena = "SIETE"; break;
                                                                case 8 : cadena = "OCHO"; break;
                                                                    case 9 : cadena = "NUEVE"; break;
                                                                        
                            }
                        }
                        }
           }
       
    
           }
    

    
    
 
        return cadena;
            
    
    
}
    public static void main (String [] args){
        
        
        int r = 0;  //recibido
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el numero");
        r= sc.nextInt();
        System.out.print((nletra(r)));
        
        
    }
}
    

 



