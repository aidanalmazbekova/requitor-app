package kg.megalab.requitorapp.controller;


import kg.megalab.requitorapp.service.facade.OnbordingFacade;
import kg.megalab.requitorapp.model.dto.OnbordingEmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/onbording")
public class OnbordingController {

    private final OnbordingFacade onbordingFacade;

    @PostMapping("/start")
    public ResponseEntity<Void> startOnbording(@RequestBody OnbordingEmployeeDto onbordingEmployeeDto) {
        onbordingFacade.hireCandidate(onbordingEmployeeDto);
        return ResponseEntity.ok().build();
    }

}
