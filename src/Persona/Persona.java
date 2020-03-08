package Persona;
import java.io.*;
public class Persona implements Serializable {
		protected String nombre,documento,nacionalidad;
		protected int edad;
		protected boolean enfermo;
		
		
		public boolean isEnfermo() {
			return enfermo;
		}
		public String getNombre() {
			return nombre;
		}
		public String getDocumento() {
			return documento;
		}
		public String getNacionalidad() {
			return nacionalidad;
		}
		public int getEdad() {
			return edad;
		}
		
		public Persona(String nombre, String documento, String nacionalidad, int edad, boolean enfermo) {
			super();
			this.nombre = nombre;
			this.documento = documento;
			this.nacionalidad = nacionalidad;
			this.edad = edad;
			this.enfermo = enfermo;
		}
		
}
