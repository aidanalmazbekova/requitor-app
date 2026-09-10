package kg.megalab.requitorapp.service.validation.impl;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import kg.megalab.requitorapp.service.validation.AbstractValidator;
import org.springframework.stereotype.Service;

@Service
public class DocumentValidator extends AbstractValidator {

    @Override
    public void validate(OnbordingEmployeeDto onbordingEmployeeDto) {
        OnbordingEmployeeDto.Document document = onbordingEmployeeDto.document();
        if (document.psId().startsWith("ID") && document.medReference().contains("86")) {
            System.out.println("ID is passed");
        } else {
            System.out.println("Problem with ID");
        }
        next(onbordingEmployeeDto);
    }

}
