public class Vendedor extends Persona {
    private int edad;

    public Vendedor(String rut, String nombres, int edad) {
        super(nombres,rut);
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void Mostrar(){
        System.out.println("-----------------------");
        System.out.println("VENDEDOR");
        System.out.println("Nombre: " +getNombres());
        System.out.println("Edad: " +edad);
        System.out.println("Rut: " +getRut());
    }
}
