import sort.MergeSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(13);
        arrayList.add(12);
        arrayList.add(42);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arrayList);

//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList1.add(1);
//        arrayList1.add(3);
//        arrayList1.add(9);
//        arrayList1.add(10);
//
//        arrayList2.add(1);
//        arrayList2.add(2);
//        arrayList2.add(4);
//        arrayList2.add(8);
//
//        merge(arrayList1, arrayList2);

    }
}
