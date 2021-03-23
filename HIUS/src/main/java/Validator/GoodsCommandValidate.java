package Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class GoodsCommandValidate implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "goodsNo", "required");
		ValidationUtils.rejectIfEmpty(errors, "goodsClass", "required");
		ValidationUtils.rejectIfEmpty(errors, "goodsName", "required");
		ValidationUtils.rejectIfEmpty(errors, "goodsSet", "required");
		ValidationUtils.rejectIfEmpty(errors, "goodsDetail", "required");
	}
}
