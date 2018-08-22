import com.alibaba.fastjson.JSON;
import com.hhz.demo.DemoApplication;
import com.hhz.demo.dao.mongo.DeptRepository;
import com.hhz.demo.entity.Dept;
import com.hhz.demo.entity.SysUser;
import com.hhz.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class testApplication {

    @Autowired
    private UserService userService;

    @Autowired
    private DeptRepository deptRepository;

    @Test
    public void test1(){
        List<SysUser> userList = userService.getUserList();
        System.out.println(JSON.toJSONString(userList));
    }


    @Test
    public void test2(){
        Object mongoData = userService.findMongoData();

        System.out.println(JSON.toJSONString(mongoData));
    }

    @Test
    public void test3(){
        Dept t = new Dept();
        t.setAge(22);
        t.setName("张三0");
        t.setSex(0);

        Example<Dept> example = Example.of(t);

        List<Dept> all = deptRepository.findAll(example);
        deptRepository.delete(all);
    }


}

