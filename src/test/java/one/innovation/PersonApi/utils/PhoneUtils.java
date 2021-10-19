package one.innovation.PersonApi.utils;

import one.innovation.PersonApi.dto.Request.PhoneDTO;
import one.innovation.PersonApi.entities.Phone;
import one.innovation.PersonApi.enums.PhoneType;

public class PhoneUtils {
    private static final String PHONE_NUMBER = "11912345678";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
