package com.melo.trainings;

public class MaxGapProblemRecursive {

    public static void main(String[] args) {
        solution(805306373);
    }

    public static int solution(int N) {
        char[] binaryValueOfInputArr = Integer.toBinaryString(N).toCharArray();

        int startIndex = 0;
        int maxGap = 0;
        int gap = 0;

        if (Character.getNumericValue(binaryValueOfInputArr[0]) == 0) {
            for (int i = 1; i < binaryValueOfInputArr.length; i++) {
                if (binaryValueOfInputArr[i] == 1) {
                    startIndex = i;
                    break;
                }
            }
            gap = findGap(startIndex, binaryValueOfInputArr, maxGap);
        } else if (Character.getNumericValue(binaryValueOfInputArr[0]) == 1) {
            gap = findGap(startIndex, binaryValueOfInputArr, maxGap);
        }
        System.out.println(gap);
        return gap;
    }

    private static int findGap(int startIndex, char[] arr, int maxGap) {
        int gapCount = 0;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (Character.getNumericValue(arr[i]) == 0) {
                if (i == arr.length - 1) {
                    gapCount = 0;
                    startIndex = arr.length - 1;
                    break;
                }
                gapCount++;
            } else if (Character.getNumericValue(arr[i]) == 1) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == arr.length - 1) {
            if (gapCount > maxGap) {
                maxGap = gapCount;
            }
            return maxGap;
        } else {
            if (gapCount > maxGap) {
                maxGap = gapCount;
            }
            return findGap(startIndex, arr, maxGap);
        }

    }

}
