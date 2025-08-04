package com.fnkcode.sec08.lec01;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.DEDUCTION,
        defaultImpl = Address.AddressDetails.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Address.SavedAddress.class),
        @JsonSubTypes.Type(value = Address.AddressDetails.class)
})
public sealed interface Address {
    //case where jackson knows how to deserialize based on the DEDUCTION : if he can figure it out from json structure

    record SavedAddress(String id) implements Address {
    }
    record AddressDetails(String street, String number, String zipcode) implements Address {
    }
}
