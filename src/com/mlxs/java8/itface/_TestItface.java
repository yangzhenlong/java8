/**
 * 
 */
package com.mlxs.java8.itface;

/**
 * 
 * @author <a href="mailto:yangzl@59store.com">С��</a>
 * @version 1.1 2016��4��12��
 * @since 1.1
 */
public class _TestItface implements Calc{

    /* (non-Javadoc)
     * @see com.mlxs.java8.itface.Calc#add()
     */
    @Override
    public int add(int a, int b) {
        //����ӿڵķǳ��󷽷�print
        print(a+b+"");
        return a + b;
    }
    
    public static void main(String[] args) {
        _TestItface test = new _TestItface();
        test.add(20, 10);
    }

}
