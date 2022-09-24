package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
    private static ArrayList<Ave> listado= new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad,String habitat,String genero,String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas=colorPlumas;
        listado.add(this);
    }
    public Ave(){
        this("s", 12, "x", null, null);
    }
    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "volar";
    }
    public static Animal crearHalcon(String nombre, int edad,String genero){
        ++halcones;
        Ave halcon = new Ave(nombre,edad,"montañas",genero,"cafe glorioso");
        return halcon;
    }
    public static Animal crearAguila(String nombre, int edad,String genero){
        ++aguilas;
        Ave aguila = new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
        return aguila;
    }
    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String color){
        this.colorPlumas=color;
    }

}
