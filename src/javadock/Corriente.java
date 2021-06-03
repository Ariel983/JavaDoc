package javadock;

/**
 * <p>Clase Corriente heredada de la clase Cuenta</p>
 * @author WAR MACHINE
 */
public class Corriente extends Cuenta {
    private int nrmMaxCheques;
    private Secuencial_Cheque secuencialCh;
    
    /**
     *<p>Contructor de la clase Cuenta, que recibe 3 parametros</p>
     * @param saldo
     * @param numero
     * @param nrmMaxCheques 
     */
    public Corriente(double saldo, String numero, int nrmMaxCheques) {
        super(saldo, numero);
    }
    
    /**
     *<p> Metodo para obtener el valor de nmrMaxCheque</p>
     * @return nmrMaxCheque
     */
    public int getNrmMaxCheques() {
        return nrmMaxCheques;
    }
    
    /**
     * 
     * @param nrmMaxCheques 
     */
    public void setNrmMaxCheques(int nrmMaxCheques) {
        this.nrmMaxCheques = nrmMaxCheques;
    }
    
    /**
     * 
     * @return  secuencialCh
     */
    public Secuencial_Cheque getSecuencialCh() {
        return secuencialCh;
    }
    
    /**
     * 
     * @param secuencialCh 
     */
    public void setSecuencialCh(Secuencial_Cheque secuencialCh) {
        this.secuencialCh = secuencialCh;
    }
}
