package pheonix.smiles.pheonixdemobird;


interface Person {
    void greet();
}

class Student implements Person {

    @Override
    public void greet() {
        System.out.println("Namaste!!!");
    }
}

public class AnnonymousInnerClassDemo {

    public static void main(String[] args) {
//        Person student = new Student();

        Person person = new Person() {
            @Override
            public void greet() {
                System.out.println("Namaste from Annonymous Inner Class.");
            }
        };
        person.greet();
//        student.greet();
    }
}
