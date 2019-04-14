package recursividad;

public class uso_MergeSort {

	public static void main(String args[]){
       
		MergeSort o = new MergeSort();
		int vector[]={6,9,7,10,21,4,0,87,3,5,55};
		o.ordenamientoMergeSort(vector);

		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i]+" ");
		}
	}


}
