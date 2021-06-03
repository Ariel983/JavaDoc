package javadock;

/**
 * <p>Clase que representa a las cuentas de un banco de tipo ahorro</p>
 * <p>Clase deredada de la clase Cuenta</p>
 * @author Ariel Sarango
 */
public class Ahorro extends Cuenta{
    private double interesAnual;

    /**
     * <p>contructor de la case Ahorro, mismo que recibe tres parametros</p>
     * @param saldo
     * @param numero
     * @param interesAnual 
     */
    public Ahorro(double saldo, String numero, double interesAnual) {
        super(saldo, numero);
        this.interesAnual = interesAnual;
    }

    /**
     * <p>Metodo sobreescrito de la clase Cuenta</p>
     * @return 
     */
    @Override
    public String getNumero(){
        return "CTA-AH".concat(super.getNumero());
    }
    
   /**
    * <p>Metodo para obtener el valor del interesAnual</p>
    * @return 
    */
    public double getInteresAnual(){
        return interesAnual;
    }
    
    /**
     * <p>Metodo para validad un monto valido, no puede ser negativo</p>
     * @param monto
     * @return monto
     */
    private boolean isMontoValido(double monto){
        return monto <0 ;
    }
    /**
     * Metodo para validad el monto a retirar de la cuenta 
     * @param monto 
     */
    public void retirar(double monto){
        if (isMontoValido(monto)){
            setSaldo(getSaldo() - monto);
        }else{
            throw new IllegalArgumentException("Monto no valido");
        }
    }
}
