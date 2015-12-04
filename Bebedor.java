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
    // Atributo que controla si el bebedor esta fuera del bar o dentro
    private boolean dentro;
    //Atributo que controla la temperatura exterior
    private int tempCalle;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(int limite,String nombreBebedor)
    {
        this.limite = limite;
        this.nombreBebedor = nombreBebedor;
        alcoholSangre = 0;
        dentro = true;
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

    /**
     * Método que permite salir a tomar el aire
     */
    public void salir(Calle calle){
        dentro = false;
        tempCalle = calle.getTemperatura();
    }

    /**
     * Método que permite entrar al bar
     */
    public void entrar(){
        dentro = true;
    }

    /**
     * Método que hace bajar el nivel de alcohol en sangre 
     */
    public void bajarNivel(){
        if (dentro == false){
            if (tempCalle < 0){
                alcoholSangre = alcoholSangre - 2;
            }
            else{
                alcoholSangre = alcoholSangre - 1;
            }
        }
        else{
            System.out.println("Estoy dentro, aquí no baja");
        }
        if (alcoholSangre <= 0){
            entrar();
            alcoholSangre = 0;
        }
    }
}
