package kg.megalab.requitorapp.service.validation;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;

public abstract class AbstractValidator implements CandidateValidator {

    private CandidateValidator next;

    @Override
    public void setNext(CandidateValidator nextValidator) {
        this.next = nextValidator;
    }

    protected void next(OnbordingEmployeeDto onbordingEmployeeDto) {
        if (next != null) {
            next.validate(onbordingEmployeeDto);
        }
    }

}
