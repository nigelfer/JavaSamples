package com.nigel.validsample;

import java.util.Iterator;
import java.util.Set;

import javax.validation.Path;
import javax.validation.metadata.ConstraintDescriptor;

import org.hibernate.validator.method.MethodConstraintViolation;
import org.hibernate.validator.method.MethodConstraintViolationException;

public class ValidationUtil {

    public static void getValidationError(MethodConstraintViolationException ce) throws Exception {
        String errors = null;

        Set<MethodConstraintViolation<?>> constraintViolations = ce.getConstraintViolations();
        if ((constraintViolations != null) && (!constraintViolations.isEmpty())) {
             errors = "";
             for (Iterator<MethodConstraintViolation<?>> iterator = constraintViolations.iterator(); iterator.hasNext();) {
                  MethodConstraintViolation<?> methodConstraintViolation = (MethodConstraintViolation<?>) iterator.next();
                  String message = methodConstraintViolation.getMessage();
                  Object invalidValue = methodConstraintViolation.getInvalidValue();
                  Path propertyPath = methodConstraintViolation.getPropertyPath();
                  String errorMsg = "";
                  ConstraintDescriptor<?> constraintDescriptor = methodConstraintViolation.getConstraintDescriptor();
                  if (constraintDescriptor != null) {
                       Object annotation = constraintDescriptor.getAnnotation();
					if (annotation != null) {
						errorMsg = message + ", " + propertyPath + "='"
								+ invalidValue + "' is invalid \n";
                       }
                  }
                  errors = errors + errorMsg;
             }
        }

		System.out.println(errors);
        throw new Exception(errors);
        //return errors;
   }
}

