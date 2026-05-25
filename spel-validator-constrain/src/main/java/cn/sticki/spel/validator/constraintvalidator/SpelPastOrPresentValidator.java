package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.constrain.SpelPastOrPresent;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import java.lang.reflect.Field;

/**
 * {@link SpelPastOrPresent} 注解校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2025/07/20
 */
public class SpelPastOrPresentValidator extends AbstractSpelTemporalValidator<SpelPastOrPresent> {

    @Override
    public FieldValidResult isValid(SpelPastOrPresent annotation, Object obj, Field field) throws IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected boolean isValidTemporal(Object temporal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
