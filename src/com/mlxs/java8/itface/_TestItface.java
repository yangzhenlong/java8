/**
 * 
 */
package com.mlxs.java8.itface;

/**
 * 
 * @author <a href="mailto:yangzl@59store.com">小生</a>
 * @version 1.1 2016年4月12日
 * @since 1.1
 */
public class _TestItface implements Calc{

    /* (non-Javadoc)
     * @see com.mlxs.java8.itface.Calc#add()
     */
    @Override
    public int add(int a, int b) {
        //父类接口的非抽象方法print
        print(a+b+"");
        return a + b;
    }
    
    public static void main(String[] args) {
        _TestItface test = new _TestItface();
        test.add(20, 10);
    }

}
