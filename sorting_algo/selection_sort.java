package sorting_algo;

public class selection_sort<T extends Comparable<T>> {
    public T[] sort(T array[]){
        int sizeArray=array.length;
        for(int i=0;i<sizeArray;i++){
            T min=array[i];
            int ind=i;
            for(int j=i;j<sizeArray;j++){
                if(min.compareTo(array[j])==1 || min.compareTo(array[j])==0){
                    min=array[j];
                    ind=j;
                }
            }
            T temp=array[i];
            array[i]=min;
            array[ind]=temp;
        }
        return array;
    }
}
