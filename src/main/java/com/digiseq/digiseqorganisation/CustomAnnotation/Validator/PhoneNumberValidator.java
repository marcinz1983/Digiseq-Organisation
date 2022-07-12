package com.digiseq.digiseqorganisation.CustomAnnotation.Validator;


import com.digiseq.digiseqorganisation.CustomAnnotation.Annotation.ValidPhoneNumber;
import org.springframework.beans.factory.annotation.Configurable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configurable
public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return whenMatchesPhoneNumber_thenCorrect(s);
    }


    private boolean whenMatchesPhoneNumber_thenCorrect(String phoneNumber) {
        String patterns = "^(?:(?:\\(?(?:0(?:0|" +
                "11)\\)?[\\s-]?\\(?|\\+)44\\)?[\\s-]?(?:\\(?0\\)?[\\s-]?)?)|" +
                "(?:\\(?0))(?:(?:\\d{5}\\)?[\\s-]?\\d{4,5})|" +
                "(?:\\d{4}\\)?[\\s-]?(?:\\d{5}|\\d{3}[\\s-]?\\d{3}))|" +
                "(?:\\d{3}\\)?[\\s-]?\\d{3}[\\s-]?\\d{3,4})|" +
                "(?:\\d{2}\\)?[\\s-]?\\d{4}[\\s-]?\\d{4}))(?:[\\s-]?(?:x|" +
                "ext\\.?|\\#)\\d{3,4})?$";

        Pattern pattern = Pattern.compile(patterns);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}