package dao;

import modelos.Persona;


/**
 * @author lopez
 * @version 1.0
 * @created 11-sep.-2022 00:52:33
 */
public class Operaciones {
    
	private Persona persona;


	public Operaciones(){
          persona = new Persona();
	}
        
        public Operaciones(String nom, String ape, int edad){
            this.persona = new Persona(nom, ape, edad);
        }


	public String evaluarEdad(){
            if(persona.getEdad() >= 18)
            {
		return "Mayor de edad";
            }
            return "Menor de edad";
	}

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }
}//end Operaciones