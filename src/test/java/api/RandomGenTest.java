package api;

import api.random.RandomGen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RandomGenTest {

    @Test
    public void testInvalidNumber() {
        boolean isInValid = RandomGen.isValid(01223734);
        Assert.assertTrue("Is a consecutive number", !isInValid);
    }

    @Test
    public void testValidNumber() {
        boolean isValid = RandomGen.isValid(9872392);
        Assert.assertTrue("Is a consecutive number", isValid);
    }

    public static void main(String[] args) {
        JUnitRunner.runTests(RandomGenTest.class);
    }
}
