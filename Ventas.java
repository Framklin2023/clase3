public class Ventas {
    public static void main(String[] args) {

        Afiliado maria = new Afiliado("Tolosa", "María", "Lima", 1, 250);
        Cliente john = new Cliente("Rivas", "Héctor", "Lima", "9999");
        System.out.println(maria.getApellido());
        System.out.println(john.getTelefono());
    }
}

abstract class Person {
    private String apellido;
    private String nombre;
    private String direccion;

    public Person(String apellido, String nombre, String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

class Afiliado extends Person implements Pedido {
    private long id;
    private float monto;

    public Afiliado(String apellido, String nombre, String direccion, long id, float monto) {
        super(apellido, nombre, direccion);
        this.id = id;
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String orden() {
        String msg = " El afiliado " + getId() + " debe vender de : " + getMonto() + " Soles";
        return msg;
    }

}

class Cliente extends Person implements Pedido {
    private String telefono;

    public Cliente(String apellido, String nombre, String direccion, String telefono) {
        super(apellido, nombre, direccion);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String orden() {
        String msg = " El cliente " + getApellido() + " " + getNombre() + " telefono: " + getTelefono();
        return msg;
    }

}

interface Pedido {
    public String orden();
}