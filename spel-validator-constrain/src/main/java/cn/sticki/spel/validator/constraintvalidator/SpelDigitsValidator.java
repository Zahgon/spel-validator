package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.constrain.SpelDigits;
import cn.sticki.spel.validator.core.SpelConstraintValidator;
import cn.sticki.spel.validator.core.exception.SpelParserException;
import cn.sticki.spel.validator.core.parse.SpelParser;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpelDigits} 注解校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2025/8/10
 */
public class SpelDigitsValidator implements SpelConstraintValidator<SpelDigits> {

    @Override
    public FieldValidResult isValid(SpelDigits annotation, Object obj, Field field) throws IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static final Set<Class<?>> SUPPORT_TYPE;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        hashSet.add(Number.class);
        hashSet.add(int.class);
        hashSet.add(long.class);
        hashSet.add(float.class);
        hashSet.add(double.class);
        hashSet.add(short.class);
        hashSet.add(byte.class);
        hashSet.add(CharSequence.class);
        SUPPORT_TYPE = Collections.unmodifiableSet(hashSet);
    }

    @Override
    public Set<Class<?>> supportType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
