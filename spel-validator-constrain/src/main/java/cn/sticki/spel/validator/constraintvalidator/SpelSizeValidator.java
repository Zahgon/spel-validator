package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.constrain.SpelSize;
import cn.sticki.spel.validator.core.SpelConstraintValidator;
import cn.sticki.spel.validator.core.parse.SpelParser;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import cn.sticki.spel.validator.core.util.CalcLengthUtil;
import java.lang.reflect.Field;
import java.util.Set;

/**
 * {@link SpelSize} 注解校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2024/5/5
 */
public class SpelSizeValidator implements SpelConstraintValidator<SpelSize> {

    @Override
    public FieldValidResult isValid(SpelSize annotation, Object obj, Field field) throws IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<Class<?>> supportType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
