package sorting_algo;

public class quickSort<T extends Comparable<T>> {
    public int pivotIndex(int low,int high,T array[]){
        int ind=low-1;
        T pivot=array[high];
        for(int i=low;i<high;i++){
            if(pivot.compareTo(array[i])==1){
                ind++;
                T temp=array[i];
                array[i]=array[ind];
                array[ind]=temp;
            }
        }
        ind++;
        T temp=array[high];
        array[high]=array[ind];
        array[ind]=temp;
        return ind;
    }
    public void sort(int low,int high,T array[]){
        if(low<high){
            int pivotIndex=pivotIndex(low, high, array);
            sort(low,pivotIndex-1, array);
            sort(pivotIndex+1, high, array);
        }
        
    }

}
