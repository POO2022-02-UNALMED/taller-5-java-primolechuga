package zooAnimales;
import java.util.ArrayList;
public class Reptil extends Animal{
    private static ArrayList<Reptil> listado= new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private  String colorEscamas;
    private  int largoCola;

    public Reptil(String nombre, int edad,String habitat,String genero,String color,int largoCola){
    
        super(nombre, edad, habitat, genero);
        this.colorEscamas=color;
        this.largoCola=largoCola;

        listado.add(this);
    }
    public Reptil(){
        this(null, 0,"", null, null, 0);
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public static Animal crearIguana(String nombre, int edad,String genero){
        iguanas++;
        Reptil u= new Reptil(nombre,edad,"humedal",genero,"verde",3);
       // listado.add(u);
        return u ;
    }

    public static Animal crearSerpiente(String nombre, int edad,String genero){
        serpientes++;
        Reptil i=new Reptil(nombre, edad,"jungla", genero, "blanco",1);
        //listado.add(i);
        return i;
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
