package yibo.java.util;

/**
 * Created by Liuyibo on 2017/7/27.
 * 转换类
 */

public class YiboConvert {
    /*
    * 转换方法
    * @param number 要转换的数字
    * @param baseFrom 要转换数字的进制
    * @param baseTo 要转换成的进制
    */
    public static long convert(long number,int baseFrom,int baseTo){
        long decimal = convertToDecimal(number,baseFrom);
        long result = convertFromDecimal(decimal,baseTo);
        return result;
    }
    /*
    * 转换成10进制
    * @param number 要转换的数字
    * @param baseFrom 要转换数字的进制
    */

    public static long convertToDecimal(long number,int baseFrom){
        long temp;
        int i = 0;
        long sum = 0;
        while(number!=0){
            temp = number%10;
            sum+=temp*getPow(baseFrom,i);
            i++;
            number/=10;
        }
        return sum;
    }
    /*
    * 从10进制转换
    * @param number 要转换的数字
    * @param baseTo 要转成的进制
    */
    public static long  convertFromDecimal(long number,int baseTo){
        long temp;
        StringBuffer sum = new StringBuffer();
        while(number!=0){
            temp = number%baseTo;
            sum.insert(0,temp);
            number /= baseTo;
        }
        String s = sum.toString();
        long  result = Long.parseLong(s);
        return result;
    }
    /*
    * 计算a的b次方
    * @return a^b
    * */
    public static long getPow(int a,int b){
        if(b==0){
            return 1;
        }
        else{
            return a*getPow(a,b-1);
        }
    }

}
