package com.company;

public class Student {

    public int _idNumbers[];

    public Student() {
        _idNumbers = new int[6];
        _idNumbers[0] = 20;
        _idNumbers[1] = 12;
        _idNumbers[2] = 15;
        _idNumbers[3] = 18;
        _idNumbers[4] = 30;
        _idNumbers[5] = 100;
    }

    public void SelectionSort() {
        for (int i = 0; i < _idNumbers.length; i++) {
            int min = _idNumbers[i];
            int min_i = i;
            for (int j = i + 1; j < _idNumbers.length - 1; j++)
                if (_idNumbers[j] < min) {
                    min = _idNumbers[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = _idNumbers[i];
                _idNumbers[i] = _idNumbers[min_i];
                _idNumbers[min_i] = tmp;
            }
        }
    }

    public void PrintScr() {
        for (int aIdNumber : _idNumbers) {
            System.out.println(aIdNumber);
        }
    }
}