package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import command.MemberCommand;

public class MemberCommandValidator implements Validator {
	private static final String emailRegExp = 
			"^[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private Pattern pattern;
	public MemberCommandValidator() { 
		pattern = Pattern.compile(emailRegExp);
	}	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		MemberCommand regReq = (MemberCommand)target;
		if(!regReq.getMemEmail().trim().isEmpty()) {
			Matcher matcher = pattern.matcher(regReq.getMemEmail());
			if(!matcher.matches()) {
				errors.rejectValue("memEmail", "bad");
			}
		}else {
			errors.rejectValue("memEmail", "required");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memId", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "memName", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPh", "required");
		ValidationUtils.rejectIfEmpty(errors, "memAddr", "required");
		ValidationUtils.rejectIfEmpty(errors, "memEmail", "required");
		ValidationUtils.rejectIfEmpty(errors, "memBirth", "required");	
	}
}
