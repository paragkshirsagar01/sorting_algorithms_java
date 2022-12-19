package sorting_algo;

public class bubble_sort<T extends Comparable<T>>{
    public T[] sort(T array[]){
        int sizeArray=array.length;
        for(int i=0;i<sizeArray;i++){
            for(int j=0;j<sizeArray-1;j++){
                if(array[j].compareTo(array[j+1])==1){
                    T temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}