package cn.sticki.spel.validator.core.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对象校验结果
 *
 * @author 阿杆
 * @version 1.1
 * @since 2024/4/29
 */
public class ObjectValidResult {

    private final List<FieldError> errors = new ArrayList<>();

    public static ObjectValidResult empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasError() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean noneError() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<FieldError> getErrors() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getErrorSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 添加校验结果
     * <p>
     * 当校验结果为false时，会将错误信息添加到结果中
     *
     * @param results 字段校验结果列表
     */
    public void addFieldResults(List<FieldValidResult> results) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 添加校验结果
     * <p>
     * 当校验结果为false时，会将错误信息添加到结果中
     *
     * @param result 字段校验结果
     */
    public void addFieldResult(FieldValidResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addFieldError(List<FieldError> fieldErrorList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
