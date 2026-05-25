package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.constrain.SpelMax;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import cn.sticki.spel.validator.core.util.NumberComparatorUtil;
import java.lang.reflect.Field;

/**
 * {@link SpelMax} 注解校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2024/9/29
 */
public class SpelMaxValidator extends AbstractSpelNumberCompareValidator<SpelMax> {

    @Override
    protected boolean compare(SpelMax anno, Number fieldValue, Number compareValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FieldValidResult isValid(SpelMax annotation, Object obj, Field field) throws IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
