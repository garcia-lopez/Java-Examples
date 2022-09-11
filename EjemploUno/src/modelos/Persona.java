package modelos;


/**
 * @author lopez
 * @version 1.0
 * @created 11-sep.-2022 01:05:28
 */
public class Persona {

	private String apellidos;
	private int edad;
	private String nombre;

	public Persona(){

	}

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.edad = edad;
    }

  
    
    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
}//end Persona