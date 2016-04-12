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
public interface Calc {
    
    public int add(int a,int b);
    
    default void print(String s){
        System.out.println("打印结果："+s);
    }
}
