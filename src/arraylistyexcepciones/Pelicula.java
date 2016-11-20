package arraylistyexcepciones;


public class Pelicula extends Netflix{
	
		
	// Declaraci�n atributo que no aparece en la clase padre Netflix:
	
	private int anio;
	
		
	// Constructor default:
	
	public Pelicula(){
		super();
	}
	
	//Constructor con el t�tulo y el creador
	
	public Pelicula(String titulo, String creador){
		super(titulo,creador);
	}
	
	//Constructor con todos los atributos de la clase hija Pelicula excepto visto
	
	public Pelicula(String titulo, String creador,String genero,double duracion, int anio){
		super(titulo,genero,creador,duracion);
		this.anio = anio;
			
	}
	
	// M�todos get y set para el atributo a�o, porque los m�todos set y get de los otros atributos est�n definidos en la clase padre Netflix
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	// sobreesscritura del m�todo toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nA�o: "+anio;
	}

	

	
	

}
