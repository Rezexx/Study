package prototypeTest;

import com.gupaoedu.pattern.prototype.simpleclone.ConcretePrototypeA;
//浅克隆
//值传递
public class SimplePrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        ConcretePrototypeA concretePrototypeB = (ConcretePrototypeA) concretePrototypeA.clone();
        System.out.println(concretePrototypeA);
        System.out.println(concretePrototypeB);
        System.out.println(concretePrototypeA.getAge() == concretePrototypeB.getAge());
        System.out.println(concretePrototypeB.getName() == concretePrototypeA.getName());
        System.out.println(concretePrototypeA.getHobbies() == concretePrototypeB.getHobbies());
    }
}
