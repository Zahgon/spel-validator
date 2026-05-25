package cn.sticki.spel.validator.core.manager;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注解类方法管理器。
 *
 * @author 阿杆
 * @version 1.0
 * @since 2024/5/9
 */
public class AnnotationMethodManager {

    private AnnotationMethodManager() {
    }

    private final static ConcurrentHashMap<String, Optional<Method>> METHOD_CACHE = new ConcurrentHashMap<>();

    /**
     * 获取方法。
     *
     * @param clazz      注解类
     * @param methodName 方法名
     * @return 方法，如果不存在则返回null
     */
    public static Method get(Class<? extends Annotation> clazz, String methodName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
