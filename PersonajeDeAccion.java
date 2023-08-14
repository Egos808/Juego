public class PersonajeDeAccion {
    private String nombre;
    private double altura;
    private double peso;
    private String colorPiel;
    private double porcentajePoder;
    private String estado;

    public PersonajeDeAccion(String nombre, double altura, double peso, String colorPiel, double porcentajePoder) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.porcentajePoder = porcentajePoder;
        this.estado = "Vivo";
    }

    public void atacar() {
        System.out.println(nombre + " está atacando.");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

    public void saltar() {
        System.out.println(nombre + " está saltando.");
    }

    public void esquivar() {
        System.out.println(nombre + " está esquivando.");
    }

    public void morir() {
        estado = "Muerto";
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        // Código de prueba
        PersonajeDeAccion personaje = new PersonajeDeAccion("Héroe", 1.8, 75, "Blanco", 90);
        
        System.out.println("Nombre del personaje: " + personaje.getNombre());
        personaje.atacar();
        personaje.correr();
        personaje.saltar();
        personaje.esquivar();
        personaje.morir();
    }
}
