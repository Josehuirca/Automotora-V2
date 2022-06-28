public class Cliente extends Persona{
    private String correo;
    private int edad, numeroTelefono;

    public Cliente(String rut, String nombres, String correo, int numeroTelefono, int edad) {
        super(nombres,rut);
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
        this.edad = edad;

    }
    public String getCorreo() {
        return correo;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getEdad() {
        return edad;
    }
    public void MostrarCliente(){
        System.out.println("-----------------------");
        System.out.println("CLIENTE");
        System.out.println("Nombre: " +getNombres());
        System.out.println("Edad: " +getEdad());
        System.out.println("Rut: " +getRut());
        System.out.println("Correo:" + getCorreo());
        System.out.println("Numero Telefono:"+getNumeroTelefono());
        System.out.println("-----------------------");

    }
}

