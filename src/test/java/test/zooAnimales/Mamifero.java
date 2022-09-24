package zooAnimales;
import java.util.ArrayList;
public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    public Mamifero(String nombre, int edad,String habitat,String genero,boolean pelaje,int patas){
    
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.pelaje=pelaje;
        this.patas=patas;
        listado.add(this);
    }
    public Mamifero(){
        listado.add(this);
    }
    public static int  cantidadMamiferos(){
        return listado.size();
    }
    
    @Override
    public void movimiento(){
    }

    public void crearCaballo(){
        caballos++;
    }

    public void crearLeon(){
        leones++;
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