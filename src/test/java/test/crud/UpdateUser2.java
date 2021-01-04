package test.crud;

import com.spring.mvc.entity.User;
import com.spring.mvc.repository.UserRepository;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UpdateUser2 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
        UserRepository ur = ctx.getBean(UserRepository.class);
        
        // 取得 User (永續物件)
        User user = ur.findOne(1L);
        user.setName("Jo"); // 要修改的內容
        
        // 修改 User
        ur.saveAndFlush(user); // 執行到此行資料庫就要更新
        
        System.out.println("OK");
        ctx.close();
    }
}
