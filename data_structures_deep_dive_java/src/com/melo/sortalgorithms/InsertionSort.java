package com.melo.sortalgorithms;

public class InsertionSort {

    /**
     * Genel olarak çalışma mantığı şöyledir.
     *
     * Bu algoritmada da logical partitioning yapacağız. Bubble ve selection'da olduğu gibi
     * unsorted partition mantıksal olarak oluşturup yine burası üzerinden index ilertleteceğiz.
     *
     * Fakat başlangıçtaki unsorted partition ilk elemanı dizinin 1. indexdeki elemanı olacak. Yani
     * en soldan başlatıp sağa doğru ilerleterek sağa doğru sorted partition'u genişleteceğiz
     *
     * Elimizde örnek bir dizi olsun : {20, 35, -15, 7, 55, 1, -22}
     *
     * Dizinin 0. index ini yani ilk slotunun unsorted partition olarak düşünüyoruz ve dizinin first sorted
     * elemanını 20 olarak kabul ediyoruz.
     *
     * Öncelikle firstUnsortedIndex = 1 olarak belirliyoruz.
     * ikinci olarak traverse index'imizi dizinin 0. elemanına alıyoruz.
     * Üçüncü olarak newElement isminde bir değişken tanımlayıp bunuda her döngü başında firstUnsortedElement değerine eşitleyip
     * sol tarafda kalan mantıksal bölümün içindekilerle karşılaştırıp doğru yere koyuyoruz.
     *
     * İlk Döngü
     * newElement = 35;
     * 35 > 20 old. için swap işlemi yapmıyoruz. Fakat artık onuda sorted partition'a dahil etmiş oluyoruz
     * firstUnsortedItem index değerini bir sağa yani 2. index'e getiriyoruz.
     * traverse index = 2 diyoruz.
     * traverse index = 1 diyoruz.
     * {20, 35 | -15, 7, 55, 1, -22}
     *
     * İkinci döngü
     * newElement isimli geçici değişkenimize bu sefer -15 değerini atıyoruz.
     * -15 > 35 olmadığı için sola doğru shifting yapmamız gerekecek fakat hemen 35 ile swap yapmıyoruz.
     * 35 değerini bir sağa shit ediyoruz. {20, 35 | 35, 7, 55, 1, -22}
     * -15 > 20 olmadığı için 20 değerini bir sağa shift ediyoruz. {20, 20 | 35, 7, 55, 1, -22}
     * Bu noktada daha solda compare edilecek alan kalmadı. -15 en sola insert ediyoruz
     * firstUnsortedIndex = 3 diyoruz.
     * traverse index = 2 diyoruz.
     *{-15, 20,  35 | 7, 55, 1, -22}
     *
     * Üçüncü Döngü
     *
     * 7 > 35 olmadığı için bir solundakiyle compare edilecektir traverseIndex bir sola alınır.
     * {-15, 20,  35 | 35, 55, 1, -22}
     * 7 > 20 olmadığı için bir solundakiyle compare edilecektir traverseIndex bir sola alınır.
     * {-15, 20,  20 | 35, 55, 1, -22}
     * 7 > -15 olduğu için bir sağına insert edilecektir.
     * firstUnsortedIndex = 4 diyoruz.
     * traverse index = 3 diyoruz.
     * {-15, 7,  20  35 | 55, 1, -22}
     *
     * Ve dizi sonu kadar bu adımları tekrarlıyoruz.
     * **/

    /**
     * Insertion Sort
     * <p>
     * O(n^2) time complexity e sahip quadratic bir algoritmadır.
     * In place'dir yani başka bir temp array ihtiyacı yoktur.
     * It will take 100 steps to sort 10 items / 10000 steps to sort 100 items / 1000000 steps to sort 1000 items.
     * Stable bir algoritmadır. Yani aynı iki değer varsa bunların sırasını değiştirmez.
     **/

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        int firstUnsortedIndex = 1;

        /** İlk Yaklaşım **/
        System.out.println("----------------------------------- İlk Yaklaşım -------------------------------------");
        while (firstUnsortedIndex <= intArray.length - 1) {
            System.out.println("----------------------------- " + firstUnsortedIndex + ". DÖngü -----------------------------");
            int newElement = intArray[firstUnsortedIndex];

            for (int traverseIndex = firstUnsortedIndex - 1; traverseIndex >= 0; traverseIndex--) {
                if (newElement > intArray[traverseIndex]) {
                    if (firstUnsortedIndex - traverseIndex <= 1) {
                        System.out.println("New Element " + newElement + " değeri zaten " + intArray[traverseIndex] + " değerinden büyüktür. Shit veya Swap Yok, Sorted Bölüme Dahil ediyoruz.");
                        break;
                    } else {
                        System.out.println("New Element " + newElement + " değeri " + intArray[traverseIndex] + " değerinden büyüktür. Bir sağına insert ediyoruz.");
                        intArray[traverseIndex + 1] = newElement;
                    }
                } else {
                    System.out.println("Right Shifted Value : " + intArray[traverseIndex]);
                    intArray[traverseIndex + 1] = intArray[traverseIndex];
                    if (traverseIndex == 0 && newElement < intArray[0]) {
                        intArray[0] = newElement;
                    }
                }
            }

            firstUnsortedIndex++;

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] == intArray[firstUnsortedIndex - 1]) {
                    System.out.print(intArray[i] + " | ");
                } else {
                    System.out.print(intArray[i] + " ");
                }
            }
            System.out.println();
        }

        /** İkinci Yaklaşım **/
        System.out.println("------------------------ İkinci Yaklaşım ---------------------------------------------");
        int[] intArray2 = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex2 = 1; firstUnsortedIndex2 < intArray2.length; firstUnsortedIndex2++) {
            int newElement2 = intArray2[firstUnsortedIndex2];
            int i;
            for (i = firstUnsortedIndex2; i > 0 && intArray2[i - 1] > newElement2; i--) {
                intArray2[i] = intArray2[i - 1];
            }
            intArray2[i] = newElement2;
        }
        for (int i = 0; i < intArray2.length; i++) {
            System.out.print(intArray2[i] + " ");
        }

    }
}