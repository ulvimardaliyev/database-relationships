package az.crocusoft.database.releationships.service;

import az.crocusoft.database.releationships.dao.entity.Address;
import az.crocusoft.database.releationships.dto.request.AddressRequestDto;
import az.crocusoft.database.releationships.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {
    long saveNewAddress(AddressRequestDto addressRequestDto);

    void deleteCurrentAddress(long addressId);

    AddressResponseDto getCurrentAddress(long id);

    List<Address> getAllAddresses();
}
