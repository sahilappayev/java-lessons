package com.company.generics;

public class User implements MyInter, MyInter2{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     *  <?> ---> unbounded wild card
     *  <? extends ClassName (InterfaceName)>  ---> UpperBounded
     *  <? super ClassName (InterfaceName)> ---> LoverBounded
     */
    public <F extends User> F fillUser(F f, Person<? super DemoUser> person){
        f.setAge(26);
        f.setName("Sahil");
        return f;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
