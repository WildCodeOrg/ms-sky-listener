package org.skyhigh.msskylistener.validation.SpringAspect.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.skyhigh.msskylistener.validation.validators.paramValidator.ParamValidator;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Aspect
@Component
public class MethodParamValidationAspect {

    private final ParamValidator validator;

    public MethodParamValidationAspect(ParamValidator validator) {
        this.validator = validator;
    }

    @Before(value = "@annotation(org.skyhigh.msskylistener.validation.SpringAspect.annotationsApi.ValidParams)")
    public void validateParameters(JoinPoint joinPoint) {
        Stream.of(joinPoint.getArgs()).forEach(validator::validate);
    }
}
