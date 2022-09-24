
package zooAnimales;
import gestion.Zona;
public class Animal{
    private static int totalAnimales; 
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona[]; 

    //metodos 
    public Animal( String nombre,int edad, String habitat, String genero){ //Zona zona
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
       // this.zona=new Zona[1];
       // this.zona[0]=zona;   
        totalAnimales++;
    }
    public Animal(){
        totalAnimales++;
    }
    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo(){
       return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"
        +"Aves: "+Ave.cantidadAves()+"\n"
        +"Reptiles: "+Reptil.cantidadReptiles()+"\n"
        +"Peces: "+Pez.cantidadPeces()+"\n"
        +"Anfibios: "+Anfibio.cantidadAnfibios();

    }
    public static int getTotalAnimales(){
        return totalAnimales;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setUbicacion(String genero){
        this.genero=genero;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String toString(){
       
      return ("Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero);

    }  

}