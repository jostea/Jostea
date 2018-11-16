package HomeWork11_18;

public class SomeClass {
    public static void main(String[] args) {


        try {
            throw new Order();
        } catch (OrderSubclass e) {
            System.out.println("Super Class");
        } catch (Order e) {
            System.out.println("Sub Class");
        }


        //here will be error
//        try {
//            throw new Order();
//        } catch (Order e) {
//        System.out.println("Super Class");
//        } catch (OrderSubclass e) {
//        System.out.println("Sub Class");
//        }

    }
}
