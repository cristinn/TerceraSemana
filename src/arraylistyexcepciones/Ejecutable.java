package arraylistyexcepciones;

import java.util.ArrayList;

public class Ejecutable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		//Crear pel�culas utilizando diferentes m�todos constructores:
		
		peliculas.add(new Pelicula());
		peliculas.add(new Pelicula("Alicia en el Pa�s de las Maravillas","Tim Burton"));
		peliculas.add(new Pelicula("The Imitation Game","Morten Tyldum","Drama",115,2015));
		peliculas.add(new Pelicula("Van Helsing", "Stephen Sommers","Acci�n/Fantas�a",130,2004));
		peliculas.add(new Pelicula("El M�dico","Philipp St�lzl","Drama",155,2013));
			
		//Crear series utilizando diferentes m�todos constructores:
		
		series.add(new Serie());
		series.add(new Serie("Gilmore Girls","Comedia"));
		series.add(new Serie("Black Mirror", "Ciencia ficci�n","Charlie Brooker",60,3));		
		series.add(new Serie("Homeland","Drama","Gideon Raff",42,5));
		series.add(new Serie("The X-Files","Chirs Carter","Ciencia Ficci�n",42,10));		
		
				
		// Marcar pel�culas/series vistas e incluir un excepci�n porque es un c�digo vulnerable de error
		
		try{
		peliculas.get(2).marcarVisto("2098 min. y 50 seg.");
		peliculas.get(3).marcarVisto("1087 min. y 24 seg.");
		peliculas.get(4).marcarVisto("1850 min. y 36 seg.");
						
		series.get(2).marcarVisto("898 min. y 35 seg.");
		series.get(3).marcarVisto("299 min. y 56 seg.");
		series.get(4).marcarVisto("420 min. y 50 seg.");
		
		}catch (java.lang.IndexOutOfBoundsException arrayE ){
			
			System.out.println("\nEst�s intentado entrar a una localidad que no est� definida");
		}finally{
		
		//Mostrar detalle de pel�culas y series que se visualizaron con el detalle de minutos/segundos visualizados
		
		System.out.println("\nPel�culas visualizadas: ");
		System.out.println("����������������������");
		for(int i=0;i<5;i++){
			if(peliculas.get(i).esVisto()==true){ // podriamos no poner "==true" asi: if(matPeliculas[i].esVisto()){ 
				System.out.println(peliculas.get(i).toString());
				System.out.println(peliculas.get(i).tiempoVisto());
				System.out.println("------------------------------------------------------------------");
			}
		}
		
		System.out.println("\nSeries visualizadas: ");
		System.out.println("�������������������");
		
		for(int j=0;j<5;j++){
			if(series.get(j).esVisto()==true){  // podriamos no poner "==true" asi: if(matPeliculas[i].esVisto()){ 
				System.out.println(series.get(j).toString());
				System.out.println(series.get(j).tiempoVisto());
				System.out.println("------------------------------------------------------------------");
			}
		}
		
		//Mostrar la pel�cula del a�o m�s reciente:
		
				int maxanio=0;  // variable que guardar� el a�o m�s reciente (es decir, el a�o mayor)
				int posanio =0; // variable que guardar� el �ndice del elemento con el a�o m�s reciente
								
				for(int i=0;i<5;i++){
					if(peliculas.get(i).getAnio()>maxanio){
						maxanio = peliculas.get(i).getAnio();
						posanio = i;
					}
					
				}
						System.out.println("\nPel�cula m�s reciente: ");
						System.out.println("���������������������");
						System.out.println(peliculas.get(posanio).toString());
		
		//Mostrar la serie con m�s temporadas:
		
		int maxtemp = 0; // variable que guardar� el n�mero m�ximo de temporadas
		int postemp=0;  // variable que guardar� el �ndice del elemento con mayor n�mero de temporadas
		 
		for(int j=0;j<5;j++){
			if(series.get(j).getNumtemporadas()>maxtemp){
			maxtemp = series.get(j).getNumtemporadas();
			postemp = j;
			}
			
		}
						System.out.println("\nSerie con m�s temporadas: ");
						System.out.println("������������������������");
						System.out.println(series.get(postemp).toString());
	
		
			
	}
		
}
}

	









