package estadio;
public class Estadio {

    private double capacidad;
    private String nombre_de_estadio;
    private String tipo_de_deporte;
    
    public Estadio(){
        this("","",0);
    } 
    public Estadio( String nom, String tipo,double cap) {
        capacidad = cap;
        nombre_de_estadio = nom;
        tipo_de_deporte = tipo;
    }


    
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double cap) {
        capacidad = cap;
    }

    public String getNombre_de_estadio() {
        return nombre_de_estadio;
    }

    public void setNombre_de_estadio(String nom) {
        nombre_de_estadio = nom;
    }

    public String getTipo_de_deporte() {
        return tipo_de_deporte;
    }

    public void setTipo_de_deporte(String tipo) {
        tipo_de_deporte = tipo;
    }

    @Override
    public String toString() {
        return  String.format("Nombre de Estadio:%s\n Capacidad:%f\n Tipo de Deporte:%s",getNombre_de_estadio(), getCapacidad(), getTipo_de_deporte());
    }
    
    
    

}



