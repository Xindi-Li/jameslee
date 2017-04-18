import com.elin4it.ssm.mapper.UserMapper;
import com.elin4it.ssm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lixindi on 2017/1/11.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring/springmvc.xml")
public class UserDaoTest  {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void saveTest() {


        List<User> users = userMapper.selectByExample();
    }

}
