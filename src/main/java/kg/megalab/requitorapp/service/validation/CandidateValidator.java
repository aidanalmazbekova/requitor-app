package kg.megalab.requitorapp.service.validation;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;

public interface CandidateValidator {

    void setNext(CandidateValidator nextValidator);

    void validate(OnbordingEmployeeDto onbordingEmployeeDto);

}
