
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int primo;

    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int primo)
    {
        super(primo);
        this.primo = primo;
    }

    /**
     * Devuelve el numero almacenado en el mecanismo
     */
    public int getNumero(){
        return primo;
    }

}
