package com.fnkcode.sec05.domain.contract;

import com.fnkcode.sec05.domain.Address;
import com.fnkcode.sec05.domain.enums.BusinessType;

public sealed interface Property {

    Address address();

    record Residential(Address address, int rooms) implements Property {}

    record Commercial(Address address, BusinessType businessType) implements Property{}
}
