package cn.ph.main;

import cn.hp.test.main02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ZZJ
 * @date 2021/5/17 - 16:10
 */
public class TemplatesTest {

    //prsf     private static final
    private static final main02 TEST = new main02();
    //psf      public static final
    public static final int NUM = 1;
    //psfi     public static final int
    public static final int NUM2 = 2;
    //psfs      public static final String
    public static final String NAME = "ZZJ";

    private static final String main = "3";
    
    //psvm
    public static void main(String[] args) {
        System.out.println();
        //sout
        System.out.println();
        //soutp / soutm / soutv / 返回值.sout
        System.out.println("args = " + Arrays.deepToString(args));//形参
        System.out.println("TemplatesTest.main");//方法名
        System.out.println("args = " + args);//参数
        
        //fori
        String[] arr = new String[]{"Tom","Jen","LI","HAN"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }

        //itar 循环赋值
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        
        //list.for
        List list = new ArrayList();
        list.add(123);
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }
    //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    //list.forr 倒
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list);
        }
        //ifn if(xxx == null)
        if (list == null) {

        }
        //inn if (list != null)
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
        //xxx.nn
        if (list != null) {

        }



    }

}
