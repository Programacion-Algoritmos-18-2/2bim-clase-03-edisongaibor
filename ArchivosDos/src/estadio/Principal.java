package estadio;

public class Principal {

    public static void main(String[] args) {
        {
            LeerArchivoTexto11 aplicacion = new LeerArchivoTexto11();
            OperacionData operacion = new OperacionData();
            aplicacion.abrirArchivo();
            operacion.agregarInformacion(aplicacion.leerRegistros());
            System.out.printf("El promedio es: %.2f", operacion.obtenerPromedioCapacidad());
            aplicacion.cerrarArchivo();
        }
    }

}
