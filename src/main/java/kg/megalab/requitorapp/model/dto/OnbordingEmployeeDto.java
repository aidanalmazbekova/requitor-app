package kg.megalab.requitorapp.model.dto;

public record OnbordingEmployeeDto(
        String name,
        Integer age,
        Integer yearOfExp,
        Document document,
        String email
) {

    public record Document(
            String psId,
            String medReference

    ) {
    }
}
