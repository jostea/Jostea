package HomeWork11_17;

import java.io.IOException;
import java.util.Random;

public class Service2 {
    public static void main(String[] args) {
        Random random = new Random();
        try {

            if (random.nextBoolean()) {
                throw new ExceptionC();
            } else throw new IOException();

        } catch (ExceptionB b) {
            b.printStackTrace();
        } catch (ExceptionA a) {
            a.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}
