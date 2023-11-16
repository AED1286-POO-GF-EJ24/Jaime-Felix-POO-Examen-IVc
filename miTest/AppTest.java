package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Suscripcion s1, s2;

    @BeforeAll public static void setUp() {
        s1 = new SuscripcionFisica("XYZ", "Calle Primera S/N", 0.0);
        s2 = new SuscripcionEnLinea("ABC", "abc@algo.com", 0.0);
    }

    @Test public void testDireccion1() {
        assertTrue(s1.getDireccion().equals("Error"));
    }

    @Test public void testDireccion2() {
        assertTrue(s2.getDireccion().equals("abc@algo.com"));
    }

    @Test public void testCosto1() {
        assertTrue(s1.getCosto() == 150.0);
    }

    @Test public void testCosto2() {
        assertTrue(s2.getCosto() == 90.0);
    }
}