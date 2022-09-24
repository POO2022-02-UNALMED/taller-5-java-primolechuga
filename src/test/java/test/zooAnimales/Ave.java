package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad,String habitat,String genero,String colorPlumas){
    
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }
    public Ave(){
        listado.add(this);
    }
    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public void movimiento(){
    }
    public void crearHalcon(){
    }
    public void crearAguila(){
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String color){
        this.colorPlumas=color;
    }
}
