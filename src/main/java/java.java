// Clase base Vehiculo
class Vehiculo {
    // Atributos privados
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método público para encender el vehículo
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

// Clase hija Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    // Constructor
    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobrescribiendo el método encender
    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " está encendido.");
    }
}

// Clase hija Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {
    // Constructor
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    // Sobrescribiendo el método encender
    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " está encendida.");
    }
}

// Clase principal para probar el código
 class Main {
    public static void main(String[] args) {
        // Creando instancias de Auto y Motocicleta
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Yamaha", "MT-07");

        // Llamando al método encender
        miAuto.encender(); // Salida: El auto Toyota Corolla está encendido.
        miMoto.encender(); // Salida: La motocicleta Yamaha MT-07 está encendida.
    }
}
