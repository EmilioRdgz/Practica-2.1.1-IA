class Estudiante {
    // Atributos privados de la clase Estudiante
    private String nombre;
    private int edad;
    private String matricula;
    
    // Método setGet que recibe y devuelve el valor de un atributo
    public String setGet(String atributo, String valor) {
        switch (atributo.toLowerCase()) {
            case "nombre":
                this.nombre = valor;
                return this.nombre;
            case "matricula":
                this.matricula = valor;
                return this.matricula;
            default:
                return "Atributo no reconocido";
        }
    }
    
    public String setGet(String atributo, int valor) {
        if (atributo.equalsIgnoreCase("edad")) {
            this.edad = valor;
            return String.valueOf(this.edad);
        }
        return "Atributo no reconocido";
    }
}

public class ManejarEstudiantes {
    public static void main(String[] args) {
        // Creación de tres objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        
        // Uso del método setGet para asignar y obtener valores
        System.out.println("Estudiante 1: Nombre: " + estudiante1.setGet("nombre", "Ana") + ", Edad: " + estudiante1.setGet("edad", 20) + ", Matrícula: " + estudiante1.setGet("matricula", "A12345"));
        System.out.println("Estudiante 2: Nombre: " + estudiante2.setGet("nombre", "Luis") + ", Edad: " + estudiante2.setGet("edad", 22) + ", Matrícula: " + estudiante2.setGet("matricula", "B67890"));
        System.out.println("Estudiante 3: Nombre: " + estudiante3.setGet("nombre", "Carla") + ", Edad: " + estudiante3.setGet("edad", 21) + ", Matrícula: " + estudiante3.setGet("matricula", "C54321"));
    }
}
