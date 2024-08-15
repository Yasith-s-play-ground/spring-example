package lk.ijse.dep12.spring.bean;

import org.springframework.context.annotation.Primary;

public class Kaushi implements GoodGirl {
    @Override
    @Primary
    public void kiss() {
        System.out.println("Ummmaaaaa");
        System.out.println("Ummmaaaaa");
        System.out.println("Ummmaaaaa");
        System.out.println("Ummmaaaaa");
    }
}
