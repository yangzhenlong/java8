/**
 * 
 */
package com.mlxs.java8.collection.old;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author <a href="mailto:yangzl@59store.com">С��</a>
 * @version 1.1 2016��4��12��
 * @since 1.1
 */
public class OldColl {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,1,9,100);
        
//        Collections.sort(list, (Integer a, Integer b) ->{
//            return a.compareTo(b);
//        });
        
        //��д1
//        Collections.sort(list, (Integer a, Integer b) -> a.compareTo(b));
        //��д2�����ں�����ֻ��һ�д���ģ�����ȥ��������{}�Լ�return�ؼ���
        Collections.sort(list, (a, b) -> a.compareTo(b));
        
        System.out.println(list);
    }
}
