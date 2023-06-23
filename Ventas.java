import java.util.ArrayList;

public class Ventas {
    public static void main(String[] args) {

        ArrayList<Cliente> clts = new ArrayList<Cliente>();
        System.out.println("-----------------------------------------------------------------------");
        clts.add(new Cliente("Rivas", "Héctor", "Lima", "9999"));
        clts.add(new Cliente("Saldaña", "Camila", "Ayacucho", "7777999"));
        clts.add(new Cliente("Pulse", "Yennifer", "Tarapoto", "9995559"));
        clts.add(new Cliente("Hualinus", "Jenny", "Piura", "7079999"));
        clts.forEach(c -> System.out.println(c.toString()));
        System.out.println("-----------------------------------------------------------------------");

        Afiliado[] afls = new Afiliado[3];
        afls[0] = new Afiliado("Tolosa", "María", "Lima", 1, 250);
        afls[1] = new Afiliado("Linares", "Ángel", "Huancayo", 2, 1000);
        afls[2] = new Afiliado("Lobo", "Víctor", "Cusco", 3, 5000);
        for (Afiliado a : afls) {
            System.out.println(a.toString());
        }
        System.out.println("-----------------------------------------------------------------------");
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
        String msg = " El afiliado " + getId() + " - " + getNombre() + ", debe vender de : " + getMonto() + " Soles";
        return msg;
    }

    @Override
    public String toString() {
        return getId() + ": " + getNombre() + ", cuota -> S/ " + getMonto();
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

    @Override
    public String toString() {
        return getApellido() + ", " + getNombre() + " Tel: " + getTelefono();
    }

}

interface Pedido {
    public String orden();
}