package javadock;

import java.time.LocalDate;

/**
 *<p>Clase que representa a la cuenta en un Banco
 * @author WAR MACHINE
 */
public class Cuenta {
    private double saldo;
    private String numero;
    private LocalDate fecha;
    
    /**
     * <p>Constructor de la clase Cuenta</p>
     * @param saldo
     * @param numero 
     */
    public Cuenta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;

    }
    
    /**
     * <p>Metodo de obtencio del saldo</p>
     * @return saldo
     */ 
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * <p>Metodo para validar si el saldo esta en negativo o no</p>
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        if  (!validarSalgoNoNegativo()){
            this.saldo = saldo;
        }else{

        }

    }
    
    /**
     * <p>Metodo para obtener el valor de numero</p>
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     * @param numero 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    /**
     * <p>Metodo para validar el saldo</p> 
     * @return 
     */
    private boolean validarSalgoNoNegativo(){
        return saldo <0;
    }

    /**
     * <p>Metodo para eralizar un depocito en la cuenta</p>
     * @param monto 
     */
    public void depositar(double monto){
        if (monto > 0){
            this.saldo = this.saldo + monto;
        }else{
            throw new IllegalArgumentException("ERROR");
        }
    }
}
