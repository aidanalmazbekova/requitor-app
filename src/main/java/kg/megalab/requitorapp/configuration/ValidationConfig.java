package kg.megalab.requitorapp.configuration;

import kg.megalab.requitorapp.service.validation.CandidateValidator;
import kg.megalab.requitorapp.service.validation.impl.AgeValidator;
import kg.megalab.requitorapp.service.validation.impl.DocumentValidator;
import kg.megalab.requitorapp.service.validation.impl.ExYearValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ValidationConfig {

    @Bean
    @Primary
    public CandidateValidator candidateValidatorChain(DocumentValidator documentValidator, AgeValidator ageValidator, ExYearValidator exYearValidator) {
        documentValidator.setNext(ageValidator);
        ageValidator.setNext(exYearValidator);
        return documentValidator;
    }

}
