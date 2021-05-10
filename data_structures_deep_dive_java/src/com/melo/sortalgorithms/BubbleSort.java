package com.melo.sortalgorithms;

public class BubbleSort {

    /**
     * Öncelikle unsorted partition index'i belirliyoruz. Sıralama başlarken bunu dizinin en son
     * elemanına eşitliyoruz. Yani length - 1
     * İkinci olarak i index'imiz olacak. Bu index soldan sağa elemanları karşılaştırıp yerlerini
     * değiştirirken (traverse) kullandığımız ve sağa doğru tek tek ilerlettiğimiz index
     * i = 0 diyoruz.
     *
     * Sıralama başladığında i index ve i+1 indexlerini karşılaştırıyoruz.
     * Eğer i+1 > i ise traverse ediyoruz. Ve 0'da olan i index değerini bir sağa yani 1'e ilerletiyoruz.
     * Eğer i+1 > i değilse traverse etmeden i indexini ilerletiyoruz.
     *
     * Bu işlemi i = unsortedPartitionIndex olana kadar ilerletiyoruz.
     *
     * unsortedPartition index ve sağındaki değerler sorted partition olarak isimlendirilir.
     *
     * Bu aşamada unsortedPartitionIndex'i bir sola çekiyoruz. Yani length - 2 index'ine
     * i index'ini tekrardan 0'a eşitleyip aynı işlemi tekrar yapıyoruz.
     *
     * i = unsortedPartitionIndex yani length - 2 ye eşit olduğunda ikinci sıralama döngüsüde tamamlanmış oluyor.
     * Tekrar unsortedPartitionIndex değerini bir sağa çekiyoruz. Yani length - 3
     * Artık sorted partition 'da iki tane elemanımız var. Diznin son elemanı ve ondan önceki.
     * Tekrar i = 0 diyoruz ve aynı işlemleri yapıyoruz.
     *
     * En son döngüde partition index 0' eşit olduğunda sıralama işlemi bitmiş oluyor.
     *
     * **/

    /**
     * Bubble Sort
     * - Mantıksal olarak partition yapan bir algoritmadır.
     * - O(n^2) time compexity e sahiptir.
     * - It will take 100 steps to sort 10 items.
     **/

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int unsortedPartitionIndex = intArray.length - 1;
        while (unsortedPartitionIndex != 0) {
            System.out.println(intArray.length - unsortedPartitionIndex + ". DÖngü");
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int itemp = intArray[i + 1] ;
                    intArray[i + 1] = intArray[i];
                    intArray[i] = itemp;
                }
            }
            unsortedPartitionIndex--;
            System.out.println(unsortedPartitionIndex);
        }

        System.out.println("----------Sıralanmış Dizi------------");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
