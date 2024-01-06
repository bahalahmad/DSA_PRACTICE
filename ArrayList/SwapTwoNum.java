package ArrayList;

import java.util.ArrayList;

public class SwapTwoNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(12);
        list.add(2);
        list.add(8);
        list.add(17);
        System.out.println("List Before Swapping - :");
        System.out.println(list);
        swap(list,1,4);
        System.out.println("List After Swapping - :");
        System.out.println(list);
    }
    static void swap(ArrayList<Integer> list, int index1,int index2){
        int temp = list.get(index2);
        list.set(index2,list.get(index1));
        list.set(index1,temp);
    }
}
