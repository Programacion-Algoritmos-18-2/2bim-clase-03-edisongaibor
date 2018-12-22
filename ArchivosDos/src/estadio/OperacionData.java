
package estadio;
import java.util.ArrayList;

public class OperacionData {
    ArrayList<Estadio> informacion;
    
    public void agregarInformacion(ArrayList<Estadio> info){
        informacion = info;
    }
    
    public ArrayList <Estadio> obtenerInformacion(){
        return informacion;
    }
    public double obtenerPromedioCapacidad(){
        double suma =0;
        for (int i = 0 ;i < obtenerInformacion().size(); i++) {
            suma = suma + obtenerInformacion().get(i).getCapacidad();
            
        }
        double promedio = suma / obtenerInformacion().size();
        
        return promedio;
    
}
    
    
}
