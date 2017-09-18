package prob;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Base64.class})
public class AlgoristTests {
    private static final Logger LOG = LoggerFactory.getLogger(AlgoristTests.class);
    @Test
    public void exampleTest() {
       String encodeVal = Base64.base64Encode(new byte[]{'1'});
       LOG.info(encodeVal);
    }
}
