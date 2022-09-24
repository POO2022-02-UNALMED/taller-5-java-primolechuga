package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad,String habitat,String genero,String color,int cantidad){
    
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorEscamas=color;
        this.cantidadAletas=cantidad;
        listado.add(this);
    }
    public Pez(){
        listado.add(this);
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    @Override
    public void movimiento(){
    }

    public void crearSalmon(){
    }

    public void crearBacalao(){
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String color){
        this.colorEscamas=color;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
    public void setCantidadAletas(int cantidad){
        this.cantidadAletas=cantidad;
    }
}
