package recursividad;

public class uso_QuickSort {

	public static void main(String[] args) {
		
		QuickSort o = new QuickSort();
		int vector[]={56,-7,0,65,12,20,6,33};
		o.ordenamientoQuickSort(vector, 0 ,vector.length-1);
		
		for(int i =0; i<vector.length; i++){
			System.out.print(vector[i]+ " ");
		}
	}

}
