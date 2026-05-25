package cn.sticki.spel.validator.core.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ResourceBundleMessageSource;
import java.util.Locale;

/**
 * 资源包消息解析器
 *
 * @author 阿杆
 * @since 2025/2/25
 */
@Slf4j
public class ResourceBundleMessageResolver {

    private ResourceBundleMessageResolver() {
    }

    /**
     * The name of the default message bundle.
     */
    public static final String DEFAULT_VALIDATION_MESSAGES = "cn.sticki.spel.validator.ValidationMessages";

    private static final ResourceBundleMessageSource MESSAGE_SOURCE = initMessageSource();

    private static final Object WRITE_LOCK = new Object();

    private static ResourceBundleMessageSource initMessageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames(DEFAULT_VALIDATION_MESSAGES);
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    /**
     * 重置资源包
     * <p>
     * 注意：该方法会直接修改全局静态 {@code MESSAGE_SOURCE}。
     * 在同一 JVM 内会影响所有调用方（包括并发请求和其它测试用例）。
     */
    public static void resetBasenames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * 添加资源包
     * <p>
     * 注意：该方法会直接修改全局静态 {@code MESSAGE_SOURCE}，并立即影响全局消息解析行为。
     * 新增 basename 会排在前面，优先级高于已存在配置。
     *
     * @param basename 资源包名称
     */
    public static void addBasenames(String... basename) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String getMessage(String key, Locale locale, Object... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
