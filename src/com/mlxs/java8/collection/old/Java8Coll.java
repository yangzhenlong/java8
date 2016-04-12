/**
 * 
 */
package com.mlxs.java8.collection.old;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author <a href="mailto:yangzl@59store.com">С��</a>
 * @version 1.1 2016��4��12��
 * @since 1.1
 */
public class Java8Coll {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,1,9,100);
        
        //����һ���Ƚ���
        Comparator<Integer> c = new Comparator<Integer>() {
            //�ȽϹ���
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, c);
        
        System.out.println(list);
    }
}
