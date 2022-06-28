import java.io.*;

public class GestorArchivo {
    public static Automotora leerArchivoVehiculos(Automotora automotora, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                automotora.getVehiculosAVenta().add(new Vehiculo(data[0],
                        ColorVehiculo.BLANCO.getColorVehiculo(), MarcaVehiculo.HILUX.getMarcaVehiculo(), Integer.parseInt(data[3]),Integer.parseInt(data[4]),Double.parseDouble(data[5])));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
        return automotora;
    }
    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            if(lineaVacia==false){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }
}
