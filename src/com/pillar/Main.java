package com.pillar;


//void = na kuch return kry ga

//inheritance

class parent{
    String father="sdfsdfds",mother="sdfsdfsd";
    void home(){
        System.out.println(father+"\n"+mother+"yes they are ");
    }
}

class child extends parent{
    child(){
        home();
        System.out.println("Confrim !!!!"+father+"\n"+mother);
    }
}

class Nadra{
    void bayform(){
        child samin = new child();
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
