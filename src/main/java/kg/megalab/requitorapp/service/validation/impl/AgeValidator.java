package kg.megalab.requitorapp.service.validation.impl;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import kg.megalab.requitorapp.service.validation.AbstractValidator;
import org.springframework.stereotype.Service;

@Service
public class AgeValidator extends AbstractValidator {

    @Override
    public void validate(OnbordingEmployeeDto onbordingEmployeeDto) {
        if (onbordingEmployeeDto.age() < 18) {
            System.out.println("Underage candidate");
        }
        next(onbordingEmployeeDto);
    }

}
