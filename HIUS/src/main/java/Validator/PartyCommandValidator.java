package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PartyCommandValidator implements Validator{
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors,"prNo","required");
		ValidationUtils.rejectIfEmpty(errors,"prName","required");
		ValidationUtils.rejectIfEmpty(errors,"prPrice","required");
		ValidationUtils.rejectIfEmpty(errors,"prContent","required");
		ValidationUtils.rejectIfEmpty(errors,"prImage","required");
	}

}
