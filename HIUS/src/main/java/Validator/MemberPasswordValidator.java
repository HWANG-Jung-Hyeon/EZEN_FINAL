package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import command.MemberPwCommand;

public class MemberPasswordValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		MemberPwCommand memberPwCommand = (MemberPwCommand)target;
		ValidationUtils.rejectIfEmpty(errors, "newPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "newPwCon", "required");
		ValidationUtils.rejectIfEmpty(errors, "oldPw", "required");
		if(!memberPwCommand.getNewPw().isEmpty()) {
			if(!memberPwCommand.isNewPwEqualsNewPwCon()) {
				errors.rejectValue("newPw", "nomatch");
			}
		}
	}
	

}
