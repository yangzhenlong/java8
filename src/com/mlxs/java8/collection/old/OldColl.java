/**
 * 
 */
package com.mlxs.java8.collection.old;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author <a href="mailto:yangzl@59store.com">小生</a>
 * @version 1.1 2016年4月12日
 * @since 1.1
 */
public class OldColl {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,1,9,100);
        
//        Collections.sort(list, (Integer a, Integer b) ->{
//            return a.compareTo(b);
//        });
        
        //简写1
//        Collections.sort(list, (Integer a, Integer b) -> a.compareTo(b));
        //简写2：对于函数体只有一行代码的，可以去掉大括号{}以及return关键字
        Collections.sort(list, (a, b) -> a.compareTo(b));
        
        System.out.println(list);
    }
}
