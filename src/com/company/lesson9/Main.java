package com.company.lesson9;

import com.company.lesson5.Employees;

public class Main {

    public static void main(String[] args) {

         String[][] array = new String[][]{
                {"1", "2", "2", "4"},
                {"1", "5", "2", "2"},
                {"1", "2", "2", "4"},
                {"4", "3", "7", "1"}};

        try {
            int result = exceptionsForMyArray(array,4);
            System.out.println("Cумма массива " + result);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            System.out.println("Массив имеет неверный размер!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Ошибка в ячейке:" + "[" + e.i + "]" + "[" + e.j + "]");
        } finally {

        }
    }

    public static int exceptionsForMyArray(String[][] array, int arraySize) throws MyArrayDataException, MyArraySizeException {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != arraySize) {
                throw new MyArraySizeException("Массив не соответствуют размеру", arraySize);
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    count += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать строку к числу", i, j);
                } finally {
                }
            }
        }
        return count;
    }
}
