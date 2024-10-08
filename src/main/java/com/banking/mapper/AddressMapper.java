package com.banking.mapper;

import com.banking.dto.AddressDto;
import com.banking.entity.Address;

public class AddressMapper {
	public static Address mapToAddress(AddressDto addressDto) {
		return new Address(addressDto.getAddress(), addressDto.getState(), addressDto.getCountry(), addressDto.getPincode());
	}
	
	public static AddressDto mapToAddressDto(Address address) {
		return new AddressDto(address.getAddress(), address.getState(), address.getCountry(), address.getPincode());
	}
}
