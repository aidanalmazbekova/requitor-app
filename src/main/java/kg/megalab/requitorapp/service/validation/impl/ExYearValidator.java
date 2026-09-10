package kg.megalab.requitorapp.service.validation.impl;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import kg.megalab.requitorapp.service.validation.AbstractValidator;
import org.springframework.stereotype.Service;

@Service
public class ExYearValidator extends AbstractValidator {

    @Override
    public void validate(OnbordingEmployeeDto onbordingEmployeeDto) {
        if (onbordingEmployeeDto.yearOfExp() < 2) {
            System.out.println("Not enough experience");
        }
        next(onbordingEmployeeDto);
    }

}
