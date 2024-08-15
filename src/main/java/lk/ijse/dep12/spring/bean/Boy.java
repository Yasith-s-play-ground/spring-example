package lk.ijse.dep12.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("imantha") /* Naming boy */
public class Boy {
    @Autowired
    public GoodGirl gf;
}
