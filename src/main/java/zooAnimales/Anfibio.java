package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;


    public Anfibio(String nombre, int edad,String habitat,String genero,String colorPiel,boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        listado.add(this);
    }
    public Anfibio(){
        this("xc",12, null, null, null,false);
    }
    public static int cantidadAnfibios(){
            return listado.size();
    }
    @Override
    public String movimiento(){
        return "saltar";
    }
    public static Animal crearRana(String nombre, int edad,String genero){
        ++ranas;
        Anfibio y=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
        return y;
    }
    public static Animal crearSalamandra(String nombre, int edad,String genero){
        ++salamandras;
        Anfibio j=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
        return j;
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