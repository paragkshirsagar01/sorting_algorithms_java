package sorting_algo;

public class main_class {
    public static void main(String[] args){
        bubble_sort<Integer> b=new bubble_sort<>();
        Integer[] array={5,4,2,3,1,1,2,3,4};
        array=b.sort(array);
        for (Integer integer : array) {
            System.out.println(integer);
        }


        System.out.println("selection sort");
        selection_sort<Integer> s=new selection_sort<>();
        Integer[] selection_array={5,4,2,3,1,1,2,3,4};
        selection_array=s.sort(selection_array);
        for (Integer integer : selection_array) {
            System.out.println(integer);
        }
    }
}
