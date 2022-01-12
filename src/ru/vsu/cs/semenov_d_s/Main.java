package ru.vsu.cs.semenov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arrayForPermutations = readArrayForPermutations();

        VariantsForRearrangingArrayElements variantsForRearrangingArrayElements = new VariantsForRearrangingArrayElements();
        variantsForRearrangingArrayElements.rearrangeArrayElements(arrayForPermutations);
    }

    private static String[] readArrayForPermutations() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an array to rearrange the elements: ");
        return scn.nextLine().split(" ");
    }
}