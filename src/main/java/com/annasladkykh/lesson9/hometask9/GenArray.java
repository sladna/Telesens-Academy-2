package com.annasladkykh.lesson9.hometask9;

public class GenArray<T> {
    private T[] array;


    public GenArray(T[] array){
        this.array = array;
    }

    public T get(int index){
        return array[index];
    }

    void set(int index, T value){
        array[index] = value;
    }
}
