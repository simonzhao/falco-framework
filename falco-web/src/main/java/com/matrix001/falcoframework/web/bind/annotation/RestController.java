package com.matrix001.falcoframework.web.bind.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RestController {
    String value() default "";
}
