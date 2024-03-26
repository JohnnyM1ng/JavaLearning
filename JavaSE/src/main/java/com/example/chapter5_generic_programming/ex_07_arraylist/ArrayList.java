package com.example.chapter5_generic_programming.ex_07_arraylist;

public class ArrayList<E> {
    private int capacity = 1;
    private int numberOfElements = 0;
    private Object[] array = new Object[capacity];

    public void add(E element, int index){
        if(index<0||index>numberOfElements){
            throw new IndexOutOfBoundsException("插入位置非法，合法位置为：0~" + numberOfElements);
        }
        if(capacity==numberOfElements){
            Object[] newArray = new Object[++capacity];
            System.arraycopy(array, 0, newArray, 0, numberOfElements);
            array = newArray;
        }
        for(int i=numberOfElements; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = element;
        numberOfElements++;
    }

    public void remove(int index){
        if(index<0||index>=numberOfElements){
            throw new IndexOutOfBoundsException("删除位置非法，合法位置为：0~" + (numberOfElements-1));
        }
        for(int i = index; i < numberOfElements - 1; i++){
            array[i] = array[i + 1];
        }
        numberOfElements--;
    }

    public int getNumberOfElements(){
        return numberOfElements;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<numberOfElements; i++){
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
