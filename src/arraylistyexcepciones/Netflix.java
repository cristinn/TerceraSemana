package arraylistyexcepciones;

// Clase Padre o Superclase

public class Netflix implements IVisualizable {

	//atributos
	
	private String titulo;
	private String creador;
	private String genero;
	private double duracion;
	private boolean visto =false;
	private String tiempoVisto;
	
	
	//métodos get y set de todos los atributos excepto del atributo visto
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	//Constructor default
	
	public Netflix(){
		
	}

	//Constructor con el título y el creador
	
	public Netflix(String titulo, String creador){
		this.titulo = titulo;
		this.creador = creador;
		
	}

	//Constructor con todos los atributos excepto visto
	
	public Netflix(String titulo, String genero, String creador,double duracion){
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion= duracion;
	}
	
	// Método toString:
	
	public String toString(){
		return "\nTítulo: "+titulo+"\nGénero: "+genero+"\nCreador: "+creador+"\nDuración(min.): "+duracion;

	}
	
	// Sobreescritura de los métodos de la interfaz:
	
	@Override
	public void marcarVisto(String tiempoVisualizado) {
		// TODO Auto-generated method stub
		this.visto=true;
		this.tiempoVisto = "Tiempo visualización: "+tiempoVisualizado;
		
	}
		
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}
	
	@Override
	public String tiempoVisto() {
		// TODO Auto-generated method stub
		return this.tiempoVisto;
			
	}
	
	
	
		
	
}
