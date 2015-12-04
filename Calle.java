
/**
 * Write a description of class Calle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calle
{
    // Atributo que controla la temperatura
    private int temperatura;

    /**
     * Constructor for objects of class Calle
     */
    public Calle(int temperatura)
    {
        this.temperatura = temperatura;
    }
    
    /**
     * Método que permite modificar la temperatura
     */
    public void setTemperatura(int gradosCalle){
        temperatura = gradosCalle;
    }    
    
    /**
     * Método que permite saber la tempratura
     */
    public int getTemperatura(){
        return temperatura;
    }
}
