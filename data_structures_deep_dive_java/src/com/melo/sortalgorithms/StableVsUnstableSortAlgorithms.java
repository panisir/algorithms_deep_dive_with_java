package com.melo.sortalgorithms;

public class StableVsUnstableSortAlgorithms {

    /**
     * Eğer sort edilecek dizi içersinde iki aynı değer varsa
     * Stable ve Unstable kavramı burada konuşulmalıdır.
     *
     * Örnek olarak elimizde şöyle bir dizi olsun {5, 9, 3, 9, 8, 4}
     *
     * Eğer sıralama bittiğinde 1. index'deki 9 3. index deki 9'an sonra gelmiş oluyorsa
     * bu unstable sort olmuş demektir.
     *
     * Eğer durum tam tersi ise stable osrt edilmiş demektir.
     *
     * integer değerlerden oluşan bir dizide bu sorun olmayacaktır.
     * Fakat obje dizilerini sort ediyorsak bu bazı problemlere yol açabilir.
     *
     * Örneğin bubble sort stable sort algoritmalara bir örnektir.
     * Bubble sort işlemi bittiğinde 3.index'deki 9 en sonra 1.index'deki 9 ondan bir önce gelecek şekilde
     * sıralama yapılmış olur. {3, 4, 5, 8, 9, 9}
     * **/

    public static void main(String[] args) {

    }

}
