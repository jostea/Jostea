package HomeWork11_20;

import HomeWork11_16.Service;

public class Service3 {


    public void someMethod2() throws Exception {
        throw new Exception("Method 2");
    }


    public void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Method 1");
        }

    }

    public static void main(String[] args) {
        try {
            new Service3().someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

