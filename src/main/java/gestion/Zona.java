package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;
public class Zona{
    private String nombre;
    private Zoologico zoo[];
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoos){
        this.nombre=nombre;
        zoo=new Zoologico[1];
        zoo[0]=zoos;

    }
    public Zona(){

    }

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
        
    }
    public Zoologico getZoo(){
        return zoo[0];
     
    }
    public void setZoo(Zoologico zoo){
         this.zoo[0]=zoo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}