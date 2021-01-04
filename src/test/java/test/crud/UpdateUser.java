package test.crud;

import com.spring.mvc.entity.User;
import com.spring.mvc.repository.UserRepository;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UpdateUser {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        UserRepository ur = ctx.getBean(UserRepository.class);
        
        // 新增 User (游離物件)
        User user = new User();
        user.setId(9L); // 游離物件要包含 id 內容
        user.setName("Anita"); // 要修改的內容
        user.setBirth(new Date()); // 要修改的內容
        
        // 修改 User
        ur.saveAndFlush(user); // 執行到此行資料庫就要更新
        
        System.out.println("OK");
        ctx.close();
    }
}
