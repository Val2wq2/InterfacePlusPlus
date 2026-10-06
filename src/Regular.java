

// If a class implements an interface then the implementing class must provide the definition of the
// abstract methods

//Rule: If a class inherits and implements then "extends" must be performed before "implements"



// Rule: A class can implement multiple interfaces - interfaces have to be comma-separated
public class Regular extends AbstractClass implements  Interface_A, Interface_B{
    @Override
    public void method_1_A() {
        System.out.println("Regular class is implementing method _1_A");
    }

    @Override
    public void method_2_A() {
        System.out.println("Regular class is implementing method _2_A");
    }

//    @Override
//    public void display_information(){
//        System.out.println("Regular class is overriding the superclass display_information method");
//    }

    @Override
    public void method_1_B() {
        System.out.println("Regular class is overriding method _1_B");
    }

    @Override
    public void method_2_B() {
        System.out.println("Regular class is overriding method _2_B");
    }

    @Override
    public void abstract_method_AC() {
        System.out.println("Regular class is defining abstract _method_AC");
    }

    @Override
    public void method_1_C() {
        System.out.println("Regular class is defining method_1_C");
    }

    @Override
    public void method_1_D(){
        System.out.println("Regular class is defining method_1_D");
    }

    @Override
    public void abstract_method_E(){
        System.out.println("Regular class is defining method_E");
    }
}
