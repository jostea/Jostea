package HomeWork11_16;

public class Service {
    public static void main(String[] args) {

        try {
            System.out.println("Exception A");
            throw new ExceptionC();
        } catch (ExceptionA a) {
            try {
                System.out.println("Exception B");
                throw new ExceptionB();
            } catch (ExceptionA bA) {
                try {
                    System.out.println("Exception C ");
                    throw new ExceptionC();
                } catch (ExceptionA cA) {
                }
            }
        }


    }
}
