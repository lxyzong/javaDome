package com.company;

public class Dog{
    private  String name;
    private  int age;
    private  String color;

    public Dog(){
        super();
    }

    public Dog(String name,int age,String color){
        super();
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String setName){
        name=setName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int setAge){
       age=setAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String setColor){
        color=setColor;
    }

    public void printDog(){
        System.out.println("一只"+age+"岁名叫"+name+"，它的颜色是"+color);
    }

    public static void main(String []args){
        Dog dog1=new Dog();
        Dog dog2=new Dog();

        dog1.setName("tommy");
        dog1.setAge(1);
        dog1.setColor("棕黄色");
        dog1.printDog();

        dog2.setName("mm");
        dog2.setAge(2);
        dog2.setColor("黄色");
        dog2.printDog();

    }
}