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
 * @author <a href="mailto:yangzl@59store.com">小生</a>
 * @version 1.1 2016年4月12日
 * @since 1.1
 */
public class Java8Coll {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,1,9,100);
        
        //定义一个比较器
        Comparator<Integer> c = new Comparator<Integer>() {
            //比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(list, c);
        
        System.out.println(list);
    }
}
