package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.constrain.SpelFuture;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import java.lang.reflect.Field;

/**
 * {@link SpelFuture} 注解校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2025/07/20
 */
public class SpelFutureValidator extends AbstractSpelTemporalValidator<SpelFuture> {

    @Override
    public FieldValidResult isValid(SpelFuture annotation, Object obj, Field field) throws IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected boolean isValidTemporal(Object temporal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
