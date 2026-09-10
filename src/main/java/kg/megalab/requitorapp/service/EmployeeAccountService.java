package kg.megalab.requitorapp.service;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAccountService {

    public void createAccount(OnbordingEmployeeDto employeeDto) {
        System.out.println("Account for " + employeeDto.name() + " created");
    }

}
