package restpoc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import restpoc.controller.RetailProductController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationSmokeTest {

    @Autowired
    private RetailProductController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}