package cn.ph.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class helloworld {

    private static int num;

    public static void main(String[] args){

        System.out.println("hello world");

//        万能解错 导包 返回值 alt + enter
        Date date = new Date();

        ArrayList arrayList = new ArrayList();

//        提示方法参数类型( Parameter Info) ctrl + alt + /
        arrayList.add(0,123);

        //region Description
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //endregion

        //声明全局变量 alt + shift + f
        //int num = 0;
        num = 0;

        //最近修改 Ctrl + e

        //粘贴最近 ctrl + shift + v

        //查找哪里被调用过 ctrl + shift + h
    }
}
