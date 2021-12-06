

import check_simple.CheckSimple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSimpleMain {
    CheckSimple checkSimple = new CheckSimple();

    @Test
    void check37(){
        assertEquals(true,checkSimple.isPrime(37));
    }

    @Test
    void check3(){
        assertEquals(true,checkSimple.isPrime(3));
    }

    @Test
    void check5(){
        assertEquals(true,checkSimple.isPrime(5));
    }
    @Test
    void check11(){
        assertEquals(true,checkSimple.isPrime(11));
    }
    @Test
    void check19(){
        assertEquals(true,checkSimple.isPrime(19));
    }
    @Test
    void check97(){
        assertEquals(true,checkSimple.isPrime(97));
    }
    @Test
    void check4(){
        assertEquals(false,checkSimple.isPrime(4));
    }
    @Test
    void check6(){
        assertEquals(false,checkSimple.isPrime(6));
    }
    @Test
    void check12(){
        assertEquals(false,checkSimple.isPrime(12));
    }
}