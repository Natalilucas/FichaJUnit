package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils stringUtils;

    @BeforeEach
    public void setup() {
        this.stringUtils = new StringUtils();
    }
    //Não é necessário por que o metodo é static(metodo de classe)

    @Test
    void isPalidromeTest(){
        assertEquals(true, StringUtils.isPalindrome("ovo"));
        assertEquals(true, StringUtils.isPalindrome("radar"));
    }

    @Test
    public void StringUtilsPal(){
        assertFalse(stringUtils.isPalindrome("natali"));
        assertFalse(stringUtils.isPalindrome("polidromo"));
        assertFalse(stringUtils.isPalindrome("desfrilamento"));

    }

    @Test
    public void StringutilsTrue(){
        assertTrue(stringUtils.isPalindrome("ana"));
        assertTrue(stringUtils.isPalindrome("ovo"));
        assertTrue(stringUtils.isPalindrome("eve"));;

    }




}
