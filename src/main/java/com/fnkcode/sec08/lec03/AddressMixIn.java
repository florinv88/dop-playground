package com.fnkcode.sec08.lec03;

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
public class AddressMixIn {
}
