package sorting_algo;

public class merge_sort{
    public void conquer(int array[],int si,int ei,int mid){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(array[idx1]<=array[idx2]){
                merged[x++]=array[idx1++];
            }else{
                merged[x++]=array[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=array[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=array[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            array[j]=merged[i];
        }
    }
    public void divide(int si,int ei,int array[]){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(si,mid, array);
        divide(mid+1,ei, array);
        conquer(array,si,ei,mid);
    }
}
