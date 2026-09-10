package kg.megalab.requitorapp.service.facade;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import kg.megalab.requitorapp.service.DocumentDepartmentService;
import kg.megalab.requitorapp.service.EmailService;
import kg.megalab.requitorapp.service.EmployeeAccountService;
import kg.megalab.requitorapp.service.validation.CandidateValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OnbordingFacade {

    private final CandidateValidator candidateValidator;
    private final DocumentDepartmentService documentDepartmentService;
    private final EmailService emailService;
    private final EmployeeAccountService employeeAccountService;

    public void hireCandidate(OnbordingEmployeeDto onbordingEmployeeDto) {
        candidateValidator.validate(onbordingEmployeeDto);
        documentDepartmentService.sendHrArchive(onbordingEmployeeDto.document());
        emailService.sendOffer(onbordingEmployeeDto.email());
        employeeAccountService.createAccount(onbordingEmployeeDto);
    }

}
