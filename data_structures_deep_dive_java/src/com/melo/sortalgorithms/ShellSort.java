package com.melo.sortalgorithms;

/**
 * Bu algoritmada kritik konu gap değerinin kullanımıdır.
 * Gap değeri dizideki değerleri bir sonraki değer ile kıyaslamaktansa daha uzaktaki bir değer
 * ile kıyaslamak için kullanılır.
 * Gap değerinin belirlenmesinde knuth sequence tablosu kullanılır.
 * Algoritma run edildikçe gap değeri azaltılır.
 * Gap değerinin 1'e eşit olması demek insertsion sort yapıldığı anlamına gelir.
 * Asıl amaç gap aralığındaki değerleri swap ederek gap değeri bire geldiğinde insertion sort'da daha az shifting
 * yapmaktır.
 * <p>
 * Biz aşağıdaki örnekte gap değerini length / 2 şeklinde alacağız.
 * Ve her iterasyonda gap değerini ikiye böleceğiz ta ki değer 1 olana kadar.
 **/

/**
 * In place
 * Worst Case O(n^2) but it can perform much better
 * Unstable
 * **/

public class ShellSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        //int[] intArray = {20, 19, 13, 15, 16, 10, 4, 11, 17, 9, 8, 1, 2, 14, 12};
        // {7, 35, -15, 20, 55, 1, -22}
        // {-22, -15, 1, 7, 20, 35, 55}
        //shellSort(intArray);

        shellSortV2(intArray);

        System.out.println();
        System.out.println("----------Sıralanmış Dizi------------");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    public static void shellSortV2(int[] arr){

        // ORJINAL

        for(int gap = arr.length / 2; gap > 0; gap/=2){
            for (int i = gap; i < arr.length; i++){
                int newElement = arr[i];
                int j=i;
                while(j >= gap && arr[j-gap] > newElement){
                    arr[j] = arr[j-gap];
                    j-= gap;
                }
                arr[j] = newElement;
            }
        }
    }

    public static void shellSort(int[] arr) {

        // DENEMELER

        for (int gap = (arr.length / 2); gap > 0; gap /= 2) {
            for (int i = gap; i <= arr.length - 1; i++) {
                int newElement = arr[i];
                for (int j = i; j > 0 && j > gap; j -= gap) {
                    j = j - gap;
                    if (arr[j] > arr[i]) {
                        arr[i] = arr[j];
                        arr[j] = newElement;
                    }
                }
            }
        }
        System.out.println("----------Insertion'dan Önce Dizi------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        insertionSort(arr);
    }


    public static void insertionSort(int[] arr) {

        for (int firstUnsortedIndex2 = 1; firstUnsortedIndex2 < arr.length; firstUnsortedIndex2++) {
            int newElement2 = arr[firstUnsortedIndex2];
            int i;
            for (i = firstUnsortedIndex2; i > 0 && arr[i - 1] > newElement2; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement2;
        }
    }
}
