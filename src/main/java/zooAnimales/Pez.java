package zooAnimales;
import java.util.ArrayList;
public class Pez extends Animal{
    private static ArrayList<Pez> listado= new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad,String habitat,String genero,String color,int cantidad){
        super(nombre, edad, habitat, genero);
        this.colorEscamas=color;
        this.cantidadAletas=cantidad;
        listado.add(this);
    }
    public Pez(){
        this(null,0,null,null,null,0);
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return"nadar";
    }

    public static Animal crearSalmon(String nombre, int edad,String genero){
        salmones++;
        Pez o= new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        return o;
    }

    public static Animal crearBacalao(String nombre, int edad,String genero){
        bacalaos++;
        Pez k=new Pez(nombre, edad, "oceano", genero, "gris", 6);
        return k;
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
