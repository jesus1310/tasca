/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // Atributo que controla el nombre del bebedor
    private String nombreBebedor;
    // Atributo que controla la cantidad de alcohol en sangre que tiene el bebedor
    private int alcoholSangre;
    // Atributo que controla el límite de alcohol que puede tener el bebedor
    private int limite;
    
    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(int limite,String nombreBebedor)
    {
        this.limite = limite;
        this.nombreBebedor = nombreBebedor;
        alcoholSangre = 0;
    }
    
    /**
     * Método para pedir una copa
     */
    public void darCopa(Cubata copa){
        if (alcoholSangre >= limite){
            System.out.println("No me des más copas");
        }
        else{
            alcoholSangre = alcoholSangre + copa.getGrados();
        }
    }
    
    /**
     * Método para formular preguntas
     */
    public String preguntar(String nuevaPregunta)
    {
        String respuesta = null;
        if (nuevaPregunta.contains(nombreBebedor) || (alcoholSangre >= limite)){
            respuesta = nuevaPregunta.toUpperCase();
        }
        else{
            if (nuevaPregunta.length() % 2 == 0){
                respuesta = "Sí";
            }
            else{
                respuesta = "No";
            }
        }
        return respuesta;
    }
}
