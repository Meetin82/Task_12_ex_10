package ru.vsu.cs.semenov_d_s;

public class VariantsForRearrangingArrayElements {

    public void rearrangeArrayElements(String[] arr){
        rearrangeArrayElements(arr, 0);
    }

    private void rearrangeArrayElements(String[] arr, int index) {
        if (index == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < arr.length; i++) {
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            rearrangeArrayElements(arr, index + 1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
