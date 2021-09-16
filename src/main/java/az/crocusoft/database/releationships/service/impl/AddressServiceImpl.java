package az.crocusoft.database.releationships.service.impl;

import az.crocusoft.database.releationships.dao.entity.Address;
import az.crocusoft.database.releationships.dao.repository.AddressRepository;
import az.crocusoft.database.releationships.dto.request.AddressRequestDto;
import az.crocusoft.database.releationships.dto.response.AddressResponseDto;
import az.crocusoft.database.releationships.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public long saveNewAddress(AddressRequestDto addressRequestDto) {
        var addressEntity = Address
                .builder()
                .location(addressRequestDto.getLocation())
                .build();
        var id = addressRepository.save(addressEntity).getId();
        return id;
    }

    @Override
    public void deleteCurrentAddress(long addressId) {

    }

    @Override
    public AddressResponseDto getCurrentAddress(long id) {
        var addressById = addressRepository.findById(id).get();
        var addressResponse =
                AddressResponseDto
                        .builder()
                        .id(addressById.getId())
                        .library(addressById.getLibrary())
                        .location(addressById.getLocation())
                        .build();
        return addressResponse;
    }

    @Override
    public List<Address> getAllAddresses() {
        var addresses = addressRepository.findAll();
        List<Address> addresses1 = new ArrayList<>();

        for (Address addres : addresses) {
            addresses1.add(addres);
        }
        return addresses1;
    }
}
