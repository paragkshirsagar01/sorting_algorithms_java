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

        insertion_sort<Integer> isort=new insertion_sort<>();
        Integer[] insertion_array={5,4,2,3,1,1,2,3,4};
        Integer[] ansins=new Integer[9];
        for (Integer integer : ansins) {
            System.out.println(integer);
        }
        System.out.println("quicksort below");
        quickSort<Integer> qs=new quickSort<>();
        Integer[] quick_array={5,4,2,3,1,1,2,3,4};
        qs.sort(0,8, quick_array);
        for (Integer integer : quick_array) {
            System.out.println(integer);
        }
    }
}
