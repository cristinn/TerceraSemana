package arraylistyexcepciones;


public class Serie extends Netflix{
	
	private int numtemporadas = 1;
		
	// Constructor default:
	
	public Serie(){
		super();
	}
		
	//Constructor con el título y el creador
	
	public Serie(String titulo, String creador){
			super(titulo,creador);
		}
	
	//Constructor con todos los atributos de la clase hija Serie excepto visto
	
	public Serie(String titulo, String genero, String creador,double duracion, int numtemporadas){
		super(titulo,genero,creador,duracion);
		this.numtemporadas = numtemporadas;
				
	}

	// Métodos get y set para el atributo numtemporadas, porque los métodos set y get de los otros atributos están definidos en la clase padre Netflix
	
	public int getNumtemporadas() {
		return numtemporadas;
	}

	public void setNumtemporadas(int numtemporadas) {
		this.numtemporadas = numtemporadas;
	}

	// sobreesscritura del método toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nNúmero de temporadas: "+numtemporadas;
	}


	
}
