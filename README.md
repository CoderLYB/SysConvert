# SysConvert
进制转换工具类<br/>
## 使用方法<br/><br/>
引入jar包后<br/><br/>
1.<code>YiboConvert.convert(long number,int baseFrom,int baseTo)</code><br/>
  该方法是将任意进制转换成任意进制，如把二进制的1101转换成八进制<br/>
 <code>YiboConvert.convert(1101,2,8);</code><br/><br/>
2.<code>YiboConvert.convertToDecimal(long number,int baseFrom)</code><br/>
  该方法是将任意进制转换成十进制，如把二进制的1101转换成十进制<br/>
 <code>YiboConvert.convert(1101,2);</code><br/><br/>
3.<code>YiboConvert.convertFromDecimal(long number,int baseTo)</code><br/>
  该方法是将十进制转换成任意进制，如把十进制的1101转换成八进制<br/>
 <code>YiboConvert.convert(1101,8);</code><br/><br/>
 
