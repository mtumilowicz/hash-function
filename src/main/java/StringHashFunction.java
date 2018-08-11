import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by mtumilowicz on 2018-06-24.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
final class StringHashFunction {
    static int prime = 31;

    static int hash(String string) {
        return StringUtils.defaultString(string)
                .chars()
                .reduce(0, (x, y) -> prime * x + y);
    }
}
