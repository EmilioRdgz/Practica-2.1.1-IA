//Código para la clase Estudiante con métodos set y get
class Estudiante {
    // Atributos privados de la clase Estudiante
    private String nombre;
    private int edad;
    private String matricula;
    
    // Métodos set para asignar valores a los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    // Métodos get para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getMatricula() {
        return matricula;
    }
}

public class ManejarEstudiantesIA {
    public static void main(String[] args) {
        // Creación de tres objetos de la clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        
        // Asignación de valores a los atributos de cada objeto usando set
        estudiante1.setNombre("Ana");
        estudiante1.setEdad(20);
        estudiante1.setMatricula("A12345");
        
        estudiante2.setNombre("Luis");
        estudiante2.setEdad(22);
        estudiante2.setMatricula("B67890");
        
        estudiante3.setNombre("Carla");
        estudiante3.setEdad(21);
        estudiante3.setMatricula("C54321");
        
        // Despliegue de valores usando los métodos get
        System.out.println("Estudiante 1: Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad() + ", Matrícula: " + estudiante1.getMatricula());
        System.out.println("Estudiante 2: Nombre: " + estudiante2.getNombre() + ", Edad: " + estudiante2.getEdad() + ", Matrícula: " + estudiante2.getMatricula());
        System.out.println("Estudiante 3: Nombre: " + estudiante3.getNombre() + ", Edad: " + estudiante3.getEdad() + ", Matrícula: " + estudiante3.getMatricula());
    }
}
