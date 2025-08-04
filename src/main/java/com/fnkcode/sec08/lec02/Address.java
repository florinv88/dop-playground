package com.fnkcode.sec08.lec02;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type",
        defaultImpl = Address.AddressDetails.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Address.SavedAddress.class, name = "saved"),
        @JsonSubTypes.Type(value = Address.AddressDetails.class, name = "unknown")
})
public sealed interface Address {

    record SavedAddress(String id) implements Address {
    }
    record AddressDetails(String street, String number, String zipcode) implements Address {
    }
}
