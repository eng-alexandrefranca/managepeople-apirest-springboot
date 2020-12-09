package one.digitalinnovation.managepeople.managepeopleapi.dto.request;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PersonDTO {

    private Long id;

    @NotNull
    @DataSizeUnit(min = 2, max = 100)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 100)
    private String lastName;

    @NotNull
    @CPF
    private String cpf;

    private String birthDate;

    @Validated
    @NotNull
    private List<PhoneDTO> phones;


}
