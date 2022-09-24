package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private  String colorEscamas;
    private  int largoCola;

    public Reptil(String nombre, int edad,String habitat,String genero,String color,int largoCola){
    
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setHabitat(habitat);
        this.setGenero(genero);
        this.colorEscamas=color;
        this.largoCola=largoCola;
        listado.add(this);
    }
    public Reptil(){
        listado.add(this);
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public void movimiento(){
    }

    public void crearIguana(){
    }

    public void crearSerpiente(){
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String color){
        this.colorEscamas=color;
    }
    public int getLargoCola(){
        return this.largoCola;
    }
    public void setLargoCola(int largo){
        this.largoCola=largo;
    }
}