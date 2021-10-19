package one.innovation.PersonApi.utils;

import one.innovation.PersonApi.dto.Request.PersonDTO;
import one.innovation.PersonApi.entities.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {
    private static final String FIRST_NAME ="Rodrigo";
    private static final String LAST_NAME ="Furtado";
    private static final String CPF_NUMBER = "370.035.688-96";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2021,10,19);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("19-10-2021")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }
    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
