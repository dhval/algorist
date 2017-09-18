package api.regex;

import java.util.regex.Pattern;

public interface Patterns {
    // if a number contains consecutive digits.
    Pattern CONSECUTIVE_NUM = Pattern.compile("(\\d)\\1");
}
