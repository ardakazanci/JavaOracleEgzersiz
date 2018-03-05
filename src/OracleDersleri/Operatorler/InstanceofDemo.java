package OracleDersleri.Operatorler;

public class InstanceofDemo {

    public static void main(String[] args) {
        // Bu örnekte iki obje ile birlikte belirtilen sınıf mı arayüz mü yada kalıtım mı olup olmadığını kontrol ettik.



        Parent obj1 = new Parent(); // Parent Sınıfından bir obje
        Parent obj2 = new Child(); // Child Sınıfından bir obje

        System.out.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent)); // true
        System.out.println("obj1 instanceof Child: "
                + (obj1 instanceof Child)); // false
        System.out.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface)); // false
        System.out.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent)); // true
        System.out.println("obj2 instanceof Child: "
                + (obj2 instanceof Child)); // true
        System.out.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface)); // true


    }


}

class Parent {
}

class Child extends Parent implements MyInterface {
}

interface MyInterface {
}


