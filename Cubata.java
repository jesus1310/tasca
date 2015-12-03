/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    // Atributo que controla el nombre del cubata
    private String nombre;
    // Atributo que controla la cantidad de alcohol que tiene el cubata
    private int grados;
    
    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombre,int grados)
    {
        this.nombre = nombre;
        this.grados = grados;
    }
    
    /**
     * Método para devolver los grados del cubata
     */
    public int getGrados(){
        return grados;
    }
    
    /**
    * Método para devolver el nombre del cubata
    */
    public String getNombre(){
        return nombre;
    }
}
