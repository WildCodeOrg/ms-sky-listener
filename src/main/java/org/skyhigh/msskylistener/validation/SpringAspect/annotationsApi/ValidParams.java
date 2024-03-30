package org.skyhigh.msskylistener.validation.SpringAspect.annotationsApi;

import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidParams {
}
