public enum ColorVehiculo {
    BLANCO("Blanco"),
    ROJO("Rojo"),
    VERDE("Verde"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NEGRO("Negro");

    private String colorVehiculo;
    private ColorVehiculo(String colorVehiculo){
        this.colorVehiculo = colorVehiculo;
    }
    public String getColorVehiculo(){
        return colorVehiculo;
    }
}
