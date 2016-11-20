package arraylistyexcepciones;

public interface IVisualizable {

	//el metodo en la interfaz no debe tener ninguna linea de código
	
	public void marcarVisto(String tiempoVisualizado);  	//cambia el atributo de visto a true
	
	public boolean esVisto(); 			//devuelve el estado del atributo visto
	
	public String tiempoVisto(); 		//devuelve el tiempo en minutos/segundos que se visualizó el video 
	
}
