package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;


    public Anfibio(String nombre, int edad,String habitat,String genero,String colorPiel,boolean venenoso){
    
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }
    public Anfibio(){
        listado.add(this);
    }
    public static int cantidadAnfibios(){
            return listado.size();
    }
    @Override
    public void movimiento(){
    }
    public void crearRana(){
    }
    public void crearSalamandra(){
    }
    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String color){
        this.colorPiel=color;
    }
    public boolean isVenenoso(){//verificar en el documento
        return this.venenoso;
    }
}