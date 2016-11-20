package arraylistyexcepciones;


public class Serie extends Netflix{
	
	private int numtemporadas = 1;
		
	// Constructor default:
	
	public Serie(){
		super();
	}
		
	//Constructor con el t�tulo y el creador
	
	public Serie(String titulo, String creador){
			super(titulo,creador);
		}
	
	//Constructor con todos los atributos de la clase hija Serie excepto visto
	
	public Serie(String titulo, String genero, String creador,double duracion, int numtemporadas){
		super(titulo,genero,creador,duracion);
		this.numtemporadas = numtemporadas;
				
	}

	// M�todos get y set para el atributo numtemporadas, porque los m�todos set y get de los otros atributos est�n definidos en la clase padre Netflix
	
	public int getNumtemporadas() {
		return numtemporadas;
	}

	public void setNumtemporadas(int numtemporadas) {
		this.numtemporadas = numtemporadas;
	}

	// sobreesscritura del m�todo toString:
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nN�mero de temporadas: "+numtemporadas;
	}


	
}
