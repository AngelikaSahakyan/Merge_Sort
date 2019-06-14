package sort;

import java.util.ArrayList;

public class MergeSort {
    /**
     * merge two sorted arrays
     */
    private ArrayList<Integer> merge(ArrayList<Integer> first, ArrayList<Integer> second) {
        int i1 = 0;
        int i2 = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i1 < first.size() && i2 < second.size()) {
            if (first.get(i1) < second.get(i2)) {
                result.add(first.get(i1++));
            } else
                result.add(second.get(i2++));
        }
        while (i1 < first.size())
            result.add(first.get(i1++));
        while (i2 < second.size())
            result.add(second.get(i2++));

        System.out.println("Result : " + result);
        return result;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> arrayList) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        if (arrayList.size() == 1) {
            return arrayList;
        }

        first.addAll(arrayList.subList(0, arrayList.size() / 2));
        second.addAll(arrayList.subList(arrayList.size() / 2, arrayList.size()));

        System.out.println("First : " + first + " Second : " + second);
        mergeSort(first);
        mergeSort(second);
        arrayList = merge(first, second);
        return arrayList;
    }
}
