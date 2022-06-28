public enum MarcaVehiculo {
    SUSUKI("Susuki"),
    TOYOTA("Toyota"),
    NISSAN("Nissan"),
    RENAULT("Renault"),
    HONDA("Honda"),
    HYUNDAI("Hyundai"),
    HILUX("Hilux");

    private String marcaVehiculo;
    private MarcaVehiculo(String marcaVehiculo){
        this.marcaVehiculo = marcaVehiculo;
    }
    public String getMarcaVehiculo(){
        return marcaVehiculo;
    }
}
