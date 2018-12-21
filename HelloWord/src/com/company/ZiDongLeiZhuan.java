package com.company;

public class ZiDongLeiZhuan {
    public static void main(String[] args){
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char类型转为int值为"+i1);

        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型转加int类型值为"+i2);

        int a1=123;
        byte b = (byte)a1;
        System.out.println("int强制转为byte值为：" + b);
    }
}
