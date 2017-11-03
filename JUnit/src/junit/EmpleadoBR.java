/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author VicDance
 */
public class EmpleadoBR {
    
    
    float calculaSalarioBruto(int tipo, float ventaMes, float horasExtra)throws BRException{
        
        float salarioBase=0;
        int prima=0;
        
        if(tipo==1){
            salarioBase=1000;
        }else if(tipo==0){
            salarioBase=1500;
        }
        
        if(ventaMes>=1000 && ventaMes<1500){
            
            prima=100;
        }else if(ventaMes>=1500){
            
            prima=200;
        }
        
        if(horasExtra!=0){
            
            salarioBase+=20*horasExtra;
        }
        
        if((tipo!=1 && tipo!=0)|| ventaMes<0 || horasExtra<0){
          
            throw new BRException();
        }
        
        return salarioBase+prima;
    }
    
    float calcularSalarioNeto(float salarioBruto){
        
        float salarioNeto=0;
        if(salarioBruto<=1000){
            salarioNeto=salarioBruto;
        }else if(salarioBruto>1000 && salarioBruto<=1500){
            salarioNeto=(float)(salarioBruto-salarioBruto*0.16);
        }else if(salarioBruto>1500){
            salarioNeto=(float)(salarioBruto-salarioBruto+0.18);
        }
        
        return salarioNeto;
    }
}
