import java.util.ArrayList;
import java.util.List;

public class Automotora {
    private List<Vehiculo> vehiculosAVenta;
    private List<Vehiculo> vehiculosVendidos;

    public Automotora() {
        this.vehiculosAVenta = new ArrayList<Vehiculo>();
        this.vehiculosVendidos = new ArrayList<Vehiculo>();

    }

    public List<Vehiculo> getVehiculosAVenta() {
        return vehiculosAVenta;
    }

    public List<Vehiculo> getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public void añadirVendedor() {
        Vendedor vendedor = new Vendedor("207872954", "José Huircaleo", 20);
        String datos = "VENDEDOR\nNombre vendedor: \n" + vendedor.getNombres() + "\n\nRut: \n" + vendedor.getRut() + "\n\nEdad: \n" + vendedor.getEdad();
        System.out.println(datos);
        System.out.println("----------------------");
    }

    public void añadirCliente() {
        Cliente cliente = new Cliente("131523645", "Cecilia", "cecilia@gmail.com", 64011305, 35);
        String datos = "CLIENTE\nNombre cliente: \n" + cliente.getNombres() + "\n\nRut: \n" + cliente.getRut() + "\n\nCorreo: \n" + cliente.getCorreo() + "\n\nTelefono: \n" + cliente.getNumeroTelefono() + "\n\nEdad: \n" + cliente.getEdad();
        System.out.println(datos);
        System.out.println("----------------------");

    }

    public void añadirVehiculosPorVender() {
        this.vehiculosAVenta.add(new Vehiculo("Celerio",ColorVehiculo.BLANCO.getColorVehiculo(), MarcaVehiculo.SUSUKI.getMarcaVehiculo(),
                2018, 5000000, 40000.4));
        this.vehiculosAVenta.add(new Vehiculo("Hilux", ColorVehiculo.NEGRO.getColorVehiculo(), "Toyota",
                2020, 12000000, 1000));
        this.vehiculosAVenta.add(new Vehiculo("Qashqai", "Blanco", "Nissan",
                2018, 10590000, 20000.23));
        this.vehiculosAVenta.add(new Vehiculo("Cruze", "Celeste", "Chevrolet",
                2010, 4500000, 105000.144));
        this.vehiculosAVenta.add(new Vehiculo("Sail", "Gris", "Chevrolet",
                2020, 6000000, 0));
    }

    public void venderAuto(String nombre, int año) {
        for (Vehiculo auto : this.vehiculosAVenta) {
            if (auto.getNombre().equals(nombre) && auto.getAño() == año) {
                this.vehiculosVendidos.add(auto);
                this.vehiculosAVenta.remove(auto);
                break;
            }
        }
    }

    public List<Vehiculo> buscarAutoNombreForBasico(String nombre) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        for (int i = 0; i < this.vehiculosAVenta.size(); i++) {
            if (this.vehiculosAVenta.get(i).getNombre().equals(nombre)) {
                vehiculos.add(this.vehiculosAVenta.get(i));
            }
        }
        return vehiculos;
    }

    public List<Vehiculo> buscarAutoNombre(String nombre) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        for (Vehiculo auto : this.vehiculosAVenta) {
            if (auto.getNombre().equals(nombre)) {
                vehiculos.add(auto);
            }
        }
        return vehiculos;
    }

    public List<Vehiculo> buscarAutoMarca(String marca) {
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        for (Vehiculo auto : this.vehiculosAVenta) {
            if (auto.getMarca().equals(marca)) {
                vehiculos.add(auto);
            }
        }
        return vehiculos;
    }

    public void mostrarVendedor(List<Vendedor> vendedores) {
    }

    public void mostrarAutosLista(List<Vehiculo> vehiculos) {
        for (Vehiculo auto : vehiculos) {
            String datos = "nombre: " + auto.getNombre() + ", marca: " + auto.getMarca() + ", año: " + auto.getAño()
                    + ", color= " + auto.getColorVehiculo() + ", precio: " + auto.getPrecio() + ", kmRecorridos: " + auto.getKmRecorridos();
            System.out.println(datos);
        }
    }
    public void probarSistema() {
        Automotora automotora = new Automotora();
        automotora.añadirVehiculosPorVender();
        automotora.mostrarAutosLista(automotora.buscarAutoNombre("Celerio"));
        automotora.venderAuto("Celerio", 2018);
        automotora.mostrarAutosLista(automotora.getVehiculosVendidos());
    }
}

