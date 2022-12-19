package sorting_algo;

public class main_class {
    public static void main(String[] args){
        bubble_sort<Integer> b=new bubble_sort<>();
        Integer[] array={5,4,2,3,1,1,2,3,4};
        array=b.sort(array);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }
}
