public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("Juan");
        persona.setTelefono(112233445);

        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();

        System.out.println("edad = " + edad);
        System.out.println("nombre = " + nombre);
        System.out.println("telefono = " + telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

