package one;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.test.bo.BJg0101;
import com.test.service.QueryDateService;  
  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/core/spring-core.xml","classpath*:/core/spring-mybatis.xml"})  
  
public class TestMyBatis {  
	private ApplicationContext ac = null;  
	@Resource
    private QueryDateService queryDateService;  
	@Before  
	public void before() {  
	    ac = new ClassPathXmlApplicationContext("/core/spring-core.xml","/core/spring-mybatis.xml");  
	    queryDateService = (QueryDateService) ac.getBean("queryDateService");  
	}  
    @Test  
    public void test1() {  
    	BJg0101 user = queryDateService.findBj0101("7847");  
        System.out.println(JSON.toJSONString(user));  
    }  
}  