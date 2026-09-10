package kg.megalab.requitorapp.service;

import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import org.springframework.stereotype.Service;

@Service
public class DocumentDepartmentService {

    public void sendHrArchive(OnbordingEmployeeDto.Document document) {
        System.out.println("Saved new employee docs: " + document.psId());
    }

}
