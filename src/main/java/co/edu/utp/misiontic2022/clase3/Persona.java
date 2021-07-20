package co.edu.utp.misiontic2022.clase3;

public class Persona {                         // nombre de la clase

    private String nombre;                     // atributos
    private int edad;                          // atributos

    public Persona(String nombre, int edad){   // metodo constructor
        this.nombre = nombre;                  // metodo constructor
        this.edad = edad;                      // metodo constructor
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
    
    public void mostrar () {                   // metodo 
    }
}
