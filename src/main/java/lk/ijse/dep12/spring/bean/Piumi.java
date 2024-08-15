package lk.ijse.dep12.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Piumi implements GoodGirl {
    @Override
    public void kiss() {
        System.out.println("Ummmaaaaa");
    }
}
