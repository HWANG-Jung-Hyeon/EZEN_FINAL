package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import command.PartyCommand;

public class PartyCommandValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors,"prNo","required");
		ValidationUtils.rejectIfEmpty(errors,"prPl","required");
		ValidationUtils.rejectIfEmpty(errors,"prName","required");
		ValidationUtils.rejectIfEmpty(errors,"prPrice","required");
		ValidationUtils.rejectIfEmpty(errors,"prContent","required");
		ValidationUtils.rejectIfEmpty(errors,"prImage","required");
	}
	public void validate(PartyCommand partyCommand, com.google.inject.internal.Errors errors) {
		// TODO Auto-generated method stub
		
	}

}
