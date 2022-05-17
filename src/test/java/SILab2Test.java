import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    @Test
    void test1() {
        /*
            primer so 4 elementna lista
            vlez:   "#", "0", "#", "0"
            izlez:  "#", "1", "#", "1"
         */
        List<String> list1 = Arrays.asList( "#", "0", "#", "0" );
        List<String> list2 = Arrays.asList( "#", "1", "#", "1" );
        Assertions.assertEquals( SILab2.function(list1), list2 );
    }

    @Test
    void test2() {
        /*
            primer so 2 elementna lista(ne e perfektna kocka)
            vlez:   "#", "#"
            izlez:  IllegalArgumentException
         */
        List<String> list1 = Arrays.asList( "#", "#" );
        Assertions.assertThrows( IllegalArgumentException.class, () -> SILab2.function(list1) );
    }

//    @Test
//    void test3() {
//        /*
//            primer so 0 elementi vo lista
//            vlez:   /
//            izlez:  IllegalArgumentException
//         */
//        Assertions.assertThrows( IllegalArgumentException.class, () -> SILab2.function( new ArrayList<>() ) );
//    }



}
