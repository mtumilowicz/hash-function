import org.apache.commons.lang3.StringUtils;

/**
 * Created by mtumilowicz on 2018-06-24.
 */
final class StringHashFunction {
    private static final int prime = 31;

    private StringHashFunction() {
    }

    static int hash(String string) {
        return StringUtils.defaultIfEmpty(string, StringUtils.EMPTY)
                .chars()
                .reduce((x, y) -> prime * x + y)
                .orElse(0);
    }
}
