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
public interface Calc {
    
    public int add(int a,int b);
    
    default void print(String s){
        System.out.println("��ӡ�����"+s);
    }
}
