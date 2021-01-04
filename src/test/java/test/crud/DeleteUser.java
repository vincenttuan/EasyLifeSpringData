package test.crud;

import com.spring.mvc.entity.User;
import com.spring.mvc.repository.UserRepository;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DeleteUser {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        UserRepository ur = ctx.getBean(UserRepository.class);
        
        // 取得 User (永續物件)
        User user = ur.findOne(1L);
        
        // 1.刪除 User
        ur.delete(user); // 找到指定 User 物件並刪除
        
        // 2.刪除 User
        ur.delete(2L); // 指定 Id 並刪除
        
        System.out.println("OK");
        ctx.close();
    }
}
