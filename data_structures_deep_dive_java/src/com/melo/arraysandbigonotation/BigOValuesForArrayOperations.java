package com.melo.arraysandbigonotation;

public class BigOValuesForArrayOperations {


    /**
     * Big (O) notasyonda her zaman worse case düşünmek zorundayız
     * aşağıdaki örnekte total index bilgisi bizde var. En kötü durum aranan değerin
     * 7. indexde olması olur.
     * 100 eleman varsa 99. index'de olması olur.
     * 1 milyon eleman için worse case for loop un 1 milyon kez dönemsi anlamına gelir.
     * Bütün bu durumlarda O(1) yani constant complexity olacaktır.
     * Fakat index sayısını bilmediğimizde arama işlemi için n kez loop çalışacaktır.
     * Bu da demek olur ki  0(n) yani linear complexity olacaktır.
     * **/


    /** Array Operations                                    Time Complexity **/
    /** Retrieve Index                                      O(1) - Constant time
     *  Retrive without Index                               O(n) - Linear time
     *  Add an element to a full array                      O(n)
     *  Add an element to the end of an array(has space)    O(1)
     *  Insert or update an element at a specific index     O(1)
     *  Delete an element by setting it to null             O(1)
     *  Delete an element by shifting elements              O(m)
     * **/

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        int index = -1;

        /** Retrieve the index **/
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

    }

}
