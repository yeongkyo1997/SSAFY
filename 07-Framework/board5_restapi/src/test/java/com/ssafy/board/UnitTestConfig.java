package com.ssafy.board;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "file:/src/main/webapp/WEB-INF/spring/root-context.xml",
                "file:/src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
        }
)
@WebAppConfiguration
public class UnitTestConfig {

    @Autowired
    protected ApplicationContext context;

    @Autowired
    private WebApplicationContext webContext;
}
