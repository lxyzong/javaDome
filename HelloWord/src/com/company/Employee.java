package com.company;

public class Employee {
    String name;
    int age;
    String desognation;
    double money;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int setAge){
        age = setAge;
    }

    public String getDesognation() {
        return desognation;
    }

    public  void setDesognation(String setDesogn){
        desognation = setDesogn;
    }

    public double getMoney() {
        return money;
    }

    public  void setMoney(double setMoney){
        money = setMoney;
    }

    public void printEmployee(){
        System.out.println("名字："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+ desognation);
        System.out.println("薪水："+money);
    }

    public static void main(String []args){
        Employee emOne = new Employee("man");
        Employee emTwo = new Employee("woman");

        emOne.setAge(20);
        emOne.setDesognation("高级程序员");
        emOne.setMoney(15863.59);
        emOne.printEmployee();
        emTwo.setAge(22);
        emTwo.setDesognation("中级程序员");
        emTwo.setMoney(1999.54);
        emTwo.printEmployee();
    }
}
