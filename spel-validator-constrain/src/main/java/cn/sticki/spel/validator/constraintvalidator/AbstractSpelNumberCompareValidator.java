package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.core.SpelConstraintValidator;
import cn.sticki.spel.validator.core.exception.SpelParserException;
import cn.sticki.spel.validator.core.parse.SpelParser;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 约束注解 Max、Min 的抽象校验器。
 *
 * @author oddfar、阿杆
 * @version 1.0
 * @since 2024/8/25
 */
public abstract class AbstractSpelNumberCompareValidator<T extends Annotation> implements SpelConstraintValidator<T> {

    /**
     * 校验数值是否满足约束条件。
     *
     * @param fieldValue 当前元素的值
     * @param spel       SpEL表达式
     * @param obj        被校验的对象实例
     * @return 校验结果
     */
    public FieldValidResult isValid(T anno, Object fieldValue, String spel, Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 比较两个数值的大小，返回比较结果。
     *
     * @param fieldValue   当前元素的值
     * @param compareValue 比较的值，最大值或最小值
     * @return 成功时返回true，失败时返回false
     */
    protected abstract boolean compare(T anno, Number fieldValue, Number compareValue);

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
