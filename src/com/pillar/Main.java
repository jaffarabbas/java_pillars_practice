package com.pillar;


//void = na kuch return kry ga

//inheritance

//2-Multilevel inheritance

//3-hiraical inheritance

class parent{
    String father="sdfsdfds",mother="sdfsdfsd";//instance
    void home(){
        System.out.println(father+"\n"+mother+"yes they are ");
    }
}

class child extends parent{
//    child(){
//        home();
//        System.out.println("Confrim !!!!"+father+"\n"+mother);
//    }
     void child_kivasyiat_from_parent(){
         System.out.println("tum bahar niklo tumahar koi kam nahi !!!! from father : "+father+"\nor un ki sarikyhiyat : "+mother);
     }
}

class child_kai_bachy  extends parent {
//    child_kai_bachy(){
//        System.out.println("Grand father : "+father+"\nGrand Mother :"+mother);
//    }
    void potoKivasiyatBydada(){
        System.out.println("Grand father : "+father+"\nGrand Mother :"+mother+"Un logo ne jidad imran khan ko de hai or app ko bola hia bijlii ka bil bar do");
    }
}
class Nadra{
    void bayform(){
        child samin_kai_garvay = new child();
        child_kai_bachy samin = new child_kai_bachy();

        samin_kai_garvay.child_kivasyiat_from_parent();
        samin.potoKivasiyatBydada();
    }
}

public class Main {

    public static void main(String[] args) {
       Nadra obj = new Nadra();
       obj.bayform();
    }
}
