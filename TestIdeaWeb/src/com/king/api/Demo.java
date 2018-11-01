package com.king.api;

/**
 * Created by pd on 2018/10/26 21:01
 */
public class Demo {

    class Super {
        int flag = 1;

        Super(){
            test();
        }

        void test(){
            System.out.println("Super.test() flag="+flag);
        }
    }

    class Sub extends Super{
        Sub(int i){
            flag = i;
            System.out.println("Sub.Sub()flag="+flag);
        }

        void test(){
            System.out.println("Sub.test()flag="+flag);
        }
    }

    public static void main(String[] args) {
        new Demo().new Sub(5);
    }
}


//  Super.test() flag=1   Sub.Sub()flag=5