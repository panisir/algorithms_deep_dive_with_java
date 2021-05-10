package com.melo.sortalgorithms;

public class SelectionSort {

    /**
     * Burada öncelikle 0. index'deki elemanı initial olarak largest element olarak belirliyoruz.
     * İkinci olarak traverse işlemini yappacağımız ve ilerleteceğimiz index değerini 1.index'den başlatıyoruz.
     * Üçüncü olarak lastUnsortedIndex 'i yine son index' e yani length - 1 'e alıyoruz.
     * **/

    /**
     * Algoritma genel olarak şöyle çalışır.
     * Eliminizde örnek olarak {20, 35, -15, 7, 55, 1, -22}
     * İlk işlem traverse indexindeki değer ile largest eleman karşılaştırılır.
     * Yani 20 ve 35 karşılaştırılır. 35 > 20 olduğu için largest index artık 1 e ilerletilmiştir.
     * Traverse index 2'ye ilerletilir.
     * <p>
     * Tekrardan largest value ve travers index'teki değer karşılaştırması yapılır.
     * -15 > 35 olmadığı için largest index sabit kalır ve traverse index bir ilerletilir.
     * Tekrardan largest value ve travers index'teki değer karşılaştırması yapılır.
     * 7 > 35 olmadığı için largest index sabit kalır ve traverse index bir ilerletilir.
     * Tekrardan largest value ve travers index'teki değer karşılaştırması yapılır.
     * 55 > 35 olduğu için largest index değeri 55'in olduğu index'e getirilir ve traverse index bir ilerletilir.
     * Tekrardan largest value ve travers index'teki değer karşılaştırması yapılır.
     * -22 > 55 olmadığı için traverse işlemi yapılmaz ve zaten traverse index artık lastUnsortedIndex'e eşit olmuştur.
     * 55 ve 22 değerleri dizi üzerinde swap edilir.
     * İlk döngü sonucunda dizi şu hali alacaktır. {20, 35, -15, 7, -22, 1, 55}
     * <p>
     * İkinci döngüye başlamadan önce tekrar largest value 20 traverse index 35'in tuttuğu index getirilir ve
     * yukarıdaki adımlar tekrarlanır.
     * <p>
     **/


    /**
     * Selection Sort
     *  - In place bir algoritmadır.
     *  - O(n) time complexity quadratic
     *  - It will take 100 steps to sort 10 items
     *  - bubble sort kadar çok swap işlemine ihtiyaç duymaz
     *  - Unstable bir algoritmadır.
     * **/

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        int lastUnsortedIndex = intArray.length - 1;

        while (lastUnsortedIndex != 0) {
            int largestValueIndex = 0;
            System.out.println(intArray.length - lastUnsortedIndex + ". DÖngü");
            for (int traverseIndex = 1; traverseIndex <= lastUnsortedIndex; traverseIndex++) {
                if (intArray[traverseIndex] > intArray[largestValueIndex]) {
                    largestValueIndex = traverseIndex;
                }
            }

            if (intArray[largestValueIndex] > intArray[lastUnsortedIndex]) {
                System.out.println("Swapped Values " + intArray[largestValueIndex] + " ve " + intArray[lastUnsortedIndex]);

                int tempLargest = intArray[largestValueIndex];
                intArray[largestValueIndex] = intArray[lastUnsortedIndex];
                intArray[lastUnsortedIndex] = tempLargest;

            }

            lastUnsortedIndex--;
        }

        System.out.println("----------Sıralanmış Dizi------------");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}