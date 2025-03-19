package oop.labor01;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // 1 feladat
        System.out.println("Bence");
        // feladat 2
        String name = "Bence";
        for (int i = 0; i < name.length(); ++i) {
            System.out.println(name.charAt(i));
            //     String name = "Nemet,  Deak,    Bence";
            String[] res = name.split(", ");
            for (int index = 0; index < res.length; index++) {
                System.out.println(res[index].trim());
            }
        }
// van pythonos for is
// String name = "Tree";
// System.out.println(name.charAt(0));
// for ( int i = 1; i <= name.length(); ++i) {
//     System.out.println(name.substring(0,i));
//         }

// feladat 3
// double x[] = {7, -1, -3, 45, 9};
// System.out.println(maxElement(x));

// 4 feladat
//System.out.println(getBit(13,1));

//5 fel
//System.out.println(byteCount(4));

// 6 fel
// double array[] ={10, 20 ,30,40, 50 };
// System.out.println(mean(array));

// 8 fel
// double arr[] = {};
// System.out.println(secondLargest(arr));

// 9 fel
        int[] arr = new int[1000000];
        System.out.println(duplicates(arr));

        //2ik eloadas
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Jane", "Dove", 8);
        Student student3 = new Student("Jack", "Dave", 9);
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {
        if (order < 0 || order > 32) return -1;
        return (byte) ((number >> order) & 1);
    }

    public static int byteCount(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) ++count;
            num = num >> 1;
        }
        return count;
    }

    public static double mean(double array[]) {
        if (array.length == 0) return Double.NaN;
// atlag
        int len = array.length;
        double avg = 0;
        for (int i = 0; i < len; ++i) {
            avg += array[i];

        }
        avg /= len;
        double res = 0;
        for (int i = 0; i < len; ++i) {
            res += Math.pow((array[i] - avg), 2);
        }
        res /= len;
        res = Math.sqrt(res);
        return res;

    }

    public static double secondLargest(double array[]) {
        int len = array.length;
        if (len < 2) return Double.NEGATIVE_INFINITY;
        double max1, max2;
        if (array[0] > array[1]) {
            max1 = array[0];
            max2 = array[1];
        } else {
            max1 = array[1];
            max2 = array[0];
        }
        for (int i = 2; i < len; ++i) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else {
                if (array[i] > max2) max2 = array[i];
            }

        }

        if (max1 == max2) return Double.NEGATIVE_INFINITY;
        return max2;
    }

    public static int duplicates(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == arr[i + 1] && i < arr.length - 1) {
                ++count;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    ++i;
                }
            }
        }
        return count;

    }

}


