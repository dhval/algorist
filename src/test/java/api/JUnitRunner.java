package api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitRunner {
    public static void runTests(Class test) {
        // JUnitCore.main, ends with System.exit
        Result result = JUnitCore.runClasses(test);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
}
