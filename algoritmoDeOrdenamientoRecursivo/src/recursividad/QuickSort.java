package recursividad;

public class QuickSort {

	public void ordenamientoQuickSort(int[]vector,int izq, int der){
		

		  int pivote=vector[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;

		  while(i<j){                                // mientras no se crucen las búsquedas
			  if(vector[i]<=pivote && i<j){
				  i++;                               // busca elemento mayor que pivote
			  }
			  if(vector[j]>pivote){
				  j--;                               // busca elemento menor que pivote
			  }
		    
			  if (i<j) {                          // si no se han cruzado                        
		         aux= vector[i];                  // los intercambia
		         vector[i]=vector[j];
		         vector[j]=aux;
		     }
		   }
		  
		   vector[izq]=vector[j]; // se coloca el pivote en su lugar de forma que tendremos
		   vector[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   
		   if(izq<j-1)
			   ordenamientoQuickSort(vector,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
			   ordenamientoQuickSort(vector,j+1,der); // ordenamos subarray derecho
		}

}