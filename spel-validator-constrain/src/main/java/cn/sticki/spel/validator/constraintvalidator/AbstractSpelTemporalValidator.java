package cn.sticki.spel.validator.constraintvalidator;

import cn.sticki.spel.validator.core.SpelConstraintValidator;
import cn.sticki.spel.validator.core.result.FieldValidResult;
import java.lang.annotation.Annotation;
import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.*;

/**
 * 时间约束注解的抽象校验器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2025/07/20
 */
public abstract class AbstractSpelTemporalValidator<T extends Annotation> implements SpelConstraintValidator<T> {

    private static final Set<Class<?>> SUPPORT_TYPE;

    static {
        Set<Class<?>> supportTypes = new HashSet<>();
        // Java 8 time API
        supportTypes.add(Instant.class);
        supportTypes.add(LocalDate.class);
        supportTypes.add(LocalDateTime.class);
        supportTypes.add(LocalTime.class);
        supportTypes.add(MonthDay.class);
        supportTypes.add(OffsetDateTime.class);
        supportTypes.add(OffsetTime.class);
        supportTypes.add(Year.class);
        supportTypes.add(YearMonth.class);
        supportTypes.add(ZonedDateTime.class);
        // Chronos API
        supportTypes.add(ChronoLocalDate.class);
        supportTypes.add(ChronoLocalDateTime.class);
        supportTypes.add(ChronoZonedDateTime.class);
        // Legacy Date API
        supportTypes.add(Date.class);
        supportTypes.add(Calendar.class);
        SUPPORT_TYPE = Collections.unmodifiableSet(supportTypes);
    }

    /**
     * 校验时间字段
     *
     * @param fieldValue 字段值
     * @return 校验结果
     */
    protected FieldValidResult isValid(Object fieldValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 校验时间对象是否满足条件
     *
     * @param temporal 时间对象
     * @return 是否有效
     */
    protected abstract boolean isValidTemporal(Object temporal);

    /**
     * 比较两个时间对象
     *
     * @param temporal 要比较的时间对象
     * @param now      当前时间
     * @return 比较结果：负数表示temporal在now之前，0表示相等，正数表示temporal在now之后
     */
    protected int compareTemporal(Object temporal, Object now) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int compareChronoLocalDateTime(Object temporal, Object now) {
        if (!(temporal instanceof ChronoLocalDateTime) || !(now instanceof ChronoLocalDateTime)) {
            throw differentTypeException(temporal, now);
        }
        ChronoLocalDateTime<?> temporalDateTime = (ChronoLocalDateTime<?>) temporal;
        ChronoLocalDateTime<?> nowDateTime = (ChronoLocalDateTime<?>) now;
        return temporalDateTime.compareTo(nowDateTime);
    }

    private int compareChronoZonedDateTime(Object temporal, Object now) {
        if (!(temporal instanceof ChronoZonedDateTime) || !(now instanceof ChronoZonedDateTime)) {
            throw differentTypeException(temporal, now);
        }
        ChronoZonedDateTime<?> temporalDateTime = (ChronoZonedDateTime<?>) temporal;
        ChronoZonedDateTime<?> nowDateTime = (ChronoZonedDateTime<?>) now;
        return temporalDateTime.compareTo(nowDateTime);
    }

    private int compareChronoLocalDate(Object temporal, Object now) {
        if (!(temporal instanceof ChronoLocalDate) || !(now instanceof ChronoLocalDate)) {
            throw differentTypeException(temporal, now);
        }
        ChronoLocalDate temporalDate = (ChronoLocalDate) temporal;
        ChronoLocalDate nowDate = (ChronoLocalDate) now;
        return temporalDate.compareTo(nowDate);
    }

    private IllegalArgumentException differentTypeException(Object temporal, Object now) {
        return new IllegalArgumentException("Cannot compare different types: " + temporal.getClass().getName() + " and " + now.getClass().getName());
    }

    /**
     * 获取当前时间，类型与传入的时间对象相同
     */
    protected Object getNow(Object temporal) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Set<Class<?>> supportType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
