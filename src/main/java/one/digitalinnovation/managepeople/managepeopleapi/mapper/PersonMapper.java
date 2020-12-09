package one.digitalinnovation.managepeople.managepeopleapi.mapper;

import one.digitalinnovation.managepeople.managepeopleapi.dto.request.PersonDTO;
import one.digitalinnovation.managepeople.managepeopleapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}