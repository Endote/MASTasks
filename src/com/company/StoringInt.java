package com.company;

public class StoringInt {

    protected int size;
    protected int index = 0;
    protected Integer[] arr;


    public StoringInt(int n){
        size = n;
        arr = new Integer[size];
    }

    public void display(){
        System.out.println("Displaying array:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

    public void addInt(int number){
        System.out.println("Adding new element at "+ index + " of value: "+number+".");
        arr[index++] = number;
    }

    public void removeInt(int indice){
        System.out.println("Removing element at "+indice+" of value: "+arr[indice]+".");
        if(indice == size-1){
            arr[size-1] = null;
        } else {
            for (int i = indice; i < size-1; i++) {
                arr[i] = arr[i+1];
//                System.out.println(arr[i]);
            }
            arr[size-1] = null;
        }
        index--;
    }
}
