package org.skyhigh.msskylistener.validation.validators.fieldValidator;

import java.lang.reflect.Field;

public interface FieldValidator {

    void validate(Object entity, Field field);
}
