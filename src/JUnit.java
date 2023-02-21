import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnit {

    @Test
    public void area() {

        Circulo_JBT c1 = new Circulo_JBT(7, "circulo");
        System.out.println(c1.area());

        Circulo_JBT c2 = new Circulo_JBT(0, "circulo");
        System.out.println(c2.area());

        Circulo_JBT c3 = new Circulo_JBT(-3, "circulo");
        System.out.println(c3.area());
    }

    @Test
    public void perimetro() {

        Circulo_JBT c1 = new Circulo_JBT(7, "circulo");
        System.out.println(c1.perimetro());

        Circulo_JBT c2 = new Circulo_JBT(0, "circulo");
        System.out.println(c2.perimetro());

        Circulo_JBT c3 = new Circulo_JBT(-3, "circulo");
        System.out.println(c3.perimetro());




    }
}