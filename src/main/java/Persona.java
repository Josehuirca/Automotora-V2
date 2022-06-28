public class Persona {
    private String nombres,rut;

    public Persona(String rut, String nombres) {
        this.nombres = nombres;
        this.rut = rut;
    }
    public String getNombres(){
        return nombres;
    }
    public String getRut(){
        return rut;
    }
}
