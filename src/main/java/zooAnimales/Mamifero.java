package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado= new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    public Mamifero(String nombre, int edad,String habitat,String genero,boolean pelaje,int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
    }
    public Mamifero(){
        this("nombre", 12, "xitat", "m", true, 12);
     
    }
    public static int  cantidadMamiferos(){
        return listado.size();
    }
    
    public static Animal crearCaballo(String nombre, int edad,String genero){
        ++caballos;
        Mamifero animal = new Mamifero(nombre,edad,"pradera",genero,true,4);
        return animal;
    }

    public static Animal crearLeon(String nombre, int edad,String genero){
        ++leones;
        Mamifero animal = new Mamifero(nombre,edad,"selva",genero,true,4);
       return animal;   
    }
    public boolean isPelaje(){
        return this.pelaje;
    }
    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int patas){
        this.patas=patas;   
    }
    
}