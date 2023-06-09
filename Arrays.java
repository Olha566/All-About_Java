import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        //////////////////////removal
        int[] array = new int[]{1, 2, 3, 4};
        int indexToRemove = 1;
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        } array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
///////////////////////////////////////////////////щоб видалити
        int[] numbers = {1, 2, 3, 4, 5};
        int indexToRemove2 = 2;
        numbers[indexToRemove2] = 0; // пишу видалене значення як 0
        System.out.println(Arrays.toString(numbers));
        /////////////////////////////// щоб видалити
        Integer[] numbers3 = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers3));

        int valueToRemove = 3;
        list.remove(Integer.valueOf(valueToRemove));
// перероблюємо назад в масив
        Integer[] newNumbers = list.toArray(new Integer[0]);
// Результат: [1, 2, 4, 5]
        System.out.println(Arrays.toString(newNumbers));
//////////////////////////////////////////////////

// щоб вставити число в масив
        int [] numbers2 = new int [] {1, 5, 6, 7, 4};
        int valueToInsert = 3;
        int indexToInsert = 2;

        int [] newNumbers2 = new int [numbers2.length + 1];

        for (int i = 0; i < indexToInsert; i++) {
            newNumbers2[i] = numbers2[i];
        }
        newNumbers2[indexToInsert] = valueToInsert;
        for (int i = indexToInsert; i < numbers2.length; i++) {
            newNumbers2[i + 1] = numbers2[i];
        }
        numbers2 = newNumbers2;
        for (int number : numbers2) {
            System.out.println(number);
        }


/////////////////////////////////////////////// додала значення в масив та вивела з середини по індексу
        int[] numbers4 = new int[]{1, 2, 4, 5};
        int valueToInsert2 = 3;
        int indexToInsert2 = 2;

        int[] newNumbers4 = new int[numbers.length + 1];

        for (int i = 0; i < indexToInsert2; i++) {
            newNumbers4[i] = numbers4[i];
        }
        newNumbers[indexToInsert2] = valueToInsert2;
        for (int i = indexToInsert2; i < numbers.length; i++) {
            newNumbers4[i + 1] = numbers4[i];
        }
        numbers4 = newNumbers4;

        System.out.print("[" +numbers4[2] + "," + numbers4[3] + "," + numbers4[4]+ "]");
        /////////////////////////////////////////////////////////////////////////////////////
        //////виводить 4ри раза всі елементи
        int[] numberThree = new int[]{1, 2, 3, 4};

//        for (int i = 0; i < numberThree.length; i++) {
//            System.out.print(numberThree[2]);

        for(int numb : numberThree) {
            System.out.println(Arrays.toString(numberThree));
        }
        /////////////////////////////виводить лише раз весь масив,
        // адже в прикладі вище цикл ганяє по кожному елементу та виконує задані дії
        int[] arrays = new int [] {1, 3, 5, 6};
        System.out.println(Arrays.toString(arrays));

        //////////////////////////////////////////////////виводимо з масиву значення
        int[] ar = new int[] {1, 2, 3, 4};
        int x = 2;
        System.out.println(ar[x]);

        ///////////////////////////////////////////////////////////////2ий спосіб виведення з середини і до кінця
        int[] arr = new int[] {1, 2, 3, 4};
        int y = 2;
        for(int j = y; j < arr.length; j++){
            System.out.println(arr[j]);
            ////////////////////////////////// також можна по індексу звернутися і вивести конкретне значення
            int[] ar2 = new int[] {1, 2, 3, 4};
            System.out.println(ar2[2]);
        }
        /////////////////////////////////////////////////////////вставляємо
        int[] arra = {1, 2, 3, 4, 5};
        int addIndex = 2; // Індекс, на який вставляємо значення
        int newValue = 6; // Значення, яке додаємо

        int[] newArray = new int[arra.length + 1]; // Створюємо новий масив з більшим розміром

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == addIndex) {
                newArray[i] = newValue; // Додаємо нове значення на позицію insertIndex
            } else {
                newArray[i] = arra[j]; // Копіюємо елементи з початкового масиву
                j++;
            }
        }
        arra = newArray; // Замінюємо початковий масив новим масивом

        System.out.println(Arrays.toString(arra));

        ////////////////////////////////////////////////////
        int [] arrayss = new int[] {};
        int [] array2 = new int [2];
        int [] array3 = new int [] {1,3,4};
        //////////////////////////////////////////////////////////
        }
    }



