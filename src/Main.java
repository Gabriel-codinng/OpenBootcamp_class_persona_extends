public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "José";
        cliente.edad = 18;
        cliente.telefono = 555555555;
        cliente.credito = 1000.23;

        System.out.println("Hola, me llamo " + cliente.nombre + ", tengo " + cliente.edad +
                " años, mi número de teléfono es " + cliente.telefono + " y tengo un credito de " + cliente.credito);

        trabajador.nombre = "Manolo";
        trabajador.edad = 30;
        trabajador.telefono = 555555555;
        trabajador.salario = 1000.23;

        System.out.println("Hola, me llamo " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi número de teléfono es " +
                trabajador.telefono + " y mi salario es de " + trabajador.salario);

    }
}

class Persona {
    public String nombre;
    public int edad;

    public int telefono;
}

class Cliente extends Persona {
    public double credito;
}

class  Trabajador extends  Persona {
    public double salario;
}