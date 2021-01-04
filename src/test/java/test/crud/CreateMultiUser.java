package test.crud;

import com.github.javafaker.Faker;
import com.spring.mvc.entity.User;
import com.spring.mvc.repository.UserRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CreateMultiUser {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        UserRepository ur = ctx.getBean(UserRepository.class);
        
        Faker faker = new Faker(); // 測試資料產生器
        List<User> users = new ArrayList<>(); // 建立 users 容器
        for(int i=0;i<168;i++) {
            // 新增 User (臨時物件)
            User user = new User();
            user.setName(faker.name().lastName());
            user.setBirth(faker.date().birthday());
            users.add(user); // 加入到 users 容器中
        }
        // 儲存 User
        ur.save(users);  // 批次儲存
        
        System.out.println("OK");
        ctx.close();
    }
}
