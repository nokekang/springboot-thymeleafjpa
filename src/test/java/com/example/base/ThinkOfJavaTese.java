package com.example.base;

import org.junit.Test;

import java.util.Random;

/**
 * @program: thymeleafjpa
 * @description: java编程思想中的se案例测试
 * @author: sjk
 * @create: 2018-08-09 09:49
 **/
public class ThinkOfJavaTese {
    @Test
    public void test1(){
        String str=null;
        System.out.println("aaa"+str);
    }

    @Test
    public void test2(){
        /*int b=10;
        int a =b;
        System.out.println(a);
        System.out.println(b);
        a=20;
        System.out.println("==============");
        System.out.println(a);
        System.out.println(b);*/

        /*Integer a =1;
        Integer b=2;
        baseData(a,b);
        System.out.println(a+"  "+b);*/



        User user = new User("张三");
        User user2 = new User("李四");
        System.out.println(user);
        System.out.println(user2);
        System.out.println("+++++++++++++++++++++++++");
        introduceData(user,user2);
        System.out.println(user);
        System.out.println(user2);


    }

    private void baseData(Integer a ,Integer b){
            a=10;
            b=20;
    }
    private void introduceData(User a ,User b){
        a=new User("王五");
        b=new User("赵六");
       /* a.setUserName("王五");
        b.setUserName("赵六");*/
    }

    @Test
    public void test3(){
        /*float a = 0.5309454F;
        float b = 0.0534122F;
        System.out.println(a - b);*/
        Random random = new Random(100);
        for (int i = 0; i < 100; i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println("");
        Random random2 = new Random(100);
        for (int i = 0; i < 100; i++) {
            System.out.print(random2.nextInt(100)+" ");
        }
    }
    @Test
    public void test4(){
        int a =1;
        int y = -a;
        System.out.println(y);
        System.out.println(y + 2);

    }



}
