package com.example.project01;

public class CLB implements Comparable<CLB> {
    private int id;
    private String name;
    private int hlv;

    public CLB(int id, String name, int hlv) {
        this.id = id;
        this.name = name;
        this.hlv = hlv;
    }

    public CLB() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHlv() {
        return hlv;
    }

    public void setHlv(int hlv) {
        this.hlv = hlv;
    }

    @Override
    public int compareTo(CLB o) {
        return this.id - o.id;
    }
}
