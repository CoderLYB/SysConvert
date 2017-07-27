import org.junit.Test;
import yibo.java.util.YiboConvert;

import java.util.Scanner;

/**
 * Created by Liuyibo on 2017/7/27.
 */

public class YiboConvertTest {
    @Test
    public void testConvert(){
        System.out.println(YiboConvert.convert(611142,8,2));
    }
    @Test
    public void testConvertToDecimal(){
        System.out.println(YiboConvert.convertToDecimal(31262,16));
    }
    @Test
    public void testGetPow(){
        System.out.println(YiboConvert.getPow(2,0));
    }
    @Test
    public void testConvertFromDecimal(){
        System.out.println(YiboConvert.convertFromDecimal(201314,2));
    }
}
