package com.company.generics;

// Type parameter
// generic is using only reference types
// bounded type parameter
public class Wrapper <K, V extends User & MyInter & MyInter2> {

    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
