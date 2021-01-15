package test.menu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
    }
}
