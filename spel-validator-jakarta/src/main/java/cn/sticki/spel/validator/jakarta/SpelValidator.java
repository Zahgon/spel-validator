package cn.sticki.spel.validator.jakarta;

import cn.sticki.spel.validator.core.SpelValidContext;
import cn.sticki.spel.validator.core.SpelValidExecutor;
import cn.sticki.spel.validator.core.parse.SpelParser;
import cn.sticki.spel.validator.core.result.FieldError;
import cn.sticki.spel.validator.core.result.ObjectValidResult;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * {@link SpelValid} 的实际校验器
 *
 * @author 阿杆
 * @version 1.0
 * @since 2024/4/11
 */
@Slf4j
public class SpelValidator implements ConstraintValidator<SpelValid, Object> {

    private SpelValid spelValid;

    @Override
    public void initialize(SpelValid constraintAnnotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 生成错误信息并将其添加到验证上下文
     */
    private void buildConstraintViolation(ObjectValidResult validateObjectResult, ConstraintValidatorContext context) {
        if (validateObjectResult.noneError()) {
            return;
        }
        context.disableDefaultConstraintViolation();
        for (FieldError error : validateObjectResult.getErrors()) {
            context.buildConstraintViolationWithTemplate(error.getErrorMessage()).addPropertyNode(error.getFieldName()).addConstraintViolation();
        }
    }
}
