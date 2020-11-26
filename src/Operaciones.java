 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Operaciones {
    private double valor;
    private int monedas1;
    private int monedas2;
    private Double resultado;

    public Operaciones() 
    {
        
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public int getMonedas1() {
        return monedas1;
    }

    public void setMonedas1(int monedas1) {
        this.monedas1 = monedas1;
    }

    public int getMonedas2() {
        return monedas2;
    }

    public void setMonedas2(int monedas2) {
        this.monedas2 = monedas2;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double convertir(){
        
        if(monedas1==0 && monedas2==1){
        resultado=valor*24.19;
        }else if(monedas1==0 && monedas2==0){
        resultado=valor;
        }else if(monedas1==1 && monedas2==0){
        resultado=valor/24.19;
        }else if(monedas1==1 && monedas2==1){
        resultado=valor;
        }
        
        
        return resultado;
    }
    
    
}
