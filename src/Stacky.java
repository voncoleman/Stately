public class Stacky {

    public void run() {
        System.out.println("In Stacky::run method");
        methodA(); // run is a method of Stacky
    }

    private String methodA() {
        System.out.println("In method A() ");
        methodB();
        return "Leaving A";
    }

    private String methodB() {
        System.out.println("In method B() ");
        methodC();
        return "Leaving B";
    }

    private String methodC() {
        System.out.println("In method C() ");
        methodA();
        return "Leaving C";

    }
}
