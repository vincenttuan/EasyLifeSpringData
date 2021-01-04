package test.crud;

import com.spring.mvc.entity.User;
import com.spring.mvc.repository.UserRepository;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CreateUser {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        UserRepository ur = ctx.getBean(UserRepository.class);
        // 新增 User (臨時物件)
        User user = new User();
        user.setName("Vincent");
        user.setBirth(new Date());
        // 儲存 User
        ur.save(user);  // 方法結束(或是commit()時)才會進行資料庫的更新
        
        System.out.println("OK");
    }
}
