package recursividad;

import java.util.Arrays;

public class MergeSort {
	public  void ordenamientoMergeSort(int vector[]){
		
		if(vector.length<=1) {
			return;
		}
		
		int mitad= vector.length/2;
		
		int izq[]=Arrays.copyOfRange(vector, 0, mitad);
		int der[]=Arrays.copyOfRange(vector, mitad, vector.length);
		
		ordenamientoMergeSort(izq);
		ordenamientoMergeSort(der);       

		combinarVector(vector, izq, der);
	}

	public  void combinarVector(int vector[], int izq[],int der[]){
		
		int i=0;
        int j=0;
        
        for(int k=0;k<vector.length;k++){

        	//verifica que i no se exeda de los limites del array izquierdo
        	if(i > izq.length-1){
        		vector[k]=der[j];
        		j++;
        		continue;
        	}
        	
        	//verifica que j no se exeda de los limites del array derecho
        	if(j > der.length-1){
        		vector[k]=izq[i];
        		i++;
        		continue;
        	}
        	
        	//ordena
        	if(izq[i]<der[j]){
        		vector[k]=izq[i];
        		i++;
        	}else{
        		vector[k]=der[j];
        		j++;
        	}
        }
	}
}
