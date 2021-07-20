package co.edu.utp.misiontic2022.clase3;

// El diagrama de clses que sera utilizado para el ejercicio de herencia,
// composicion y agregacion esta en la presentacion # 3 de la unidad 1 slide #17

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona objPersona1 = new Empleado("Byron", 20, 10546.32);
        Persona objPersona2 = new Cliente("JAvier", 30, "(032) 446 23 45");
        // polimorfismo: capacidad que tiene un metodo de comportarse de diferentes maneras segun el onjeto que lo llame . ej mostrar

        objPersona1.mostrar();
        objPersona2.mostrar();

        System.out.println(objPersona1);
        System.out.println(objPersona2);

        // se crea el objeto de empresa para validar la relacion entre empresa y empleado
        //composicion ---> relacion fuerte  --> se hace atraves del atributo de la clase.

        Empresa objEmpresa = new Empresa("MisionTIC2022",(Empleado) objPersona1);
        System.out.println(objEmpresa);
    }
    
}
