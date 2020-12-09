package one.digitalinnovation.managepeople.managepeopleapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.managepeople.managepeopleapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PhoneDTO {
    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    private String number;

}
