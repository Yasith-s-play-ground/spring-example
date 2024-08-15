package lk.ijse.dep12.spring;

import lk.ijse.dep12.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        /* starting spring */
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Boy imantha = (Boy) ctx.getBean("imantha");
        System.out.println(imantha.gf);
    }
}
