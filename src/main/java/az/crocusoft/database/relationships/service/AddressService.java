package az.crocusoft.database.relationships.service;

import az.crocusoft.database.relationships.dto.request.AddressRequestDto;
import az.crocusoft.database.relationships.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {
    long saveNewAddress(AddressRequestDto addressRequestDto);

    void deleteCurrentAddress(long addressId);

    AddressResponseDto getCurrentAddress(long id);

    List<AddressResponseDto> getAllAddresses();
}
