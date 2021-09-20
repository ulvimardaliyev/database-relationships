package az.crocusoft.database.relationships.service.impl;

import az.crocusoft.database.relationships.dao.repository.AddressRepository;
import az.crocusoft.database.relationships.dto.request.AddressRequestDto;
import az.crocusoft.database.relationships.dto.response.AddressResponseDto;
import az.crocusoft.database.relationships.mapper.AddressMapper;
import az.crocusoft.database.relationships.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    private final AddressMapper addressMapper;

    @Override
    public long saveNewAddress(AddressRequestDto addressRequestDto) {
        var addressEntity = addressMapper.addressRequestDtoToAddressEntity(addressRequestDto);
        var id = addressRepository.save(addressEntity).getId();
        return id;
    }

    @Override
    public void deleteCurrentAddress(long addressId) {
        addressRepository.deleteById(addressId);
    }

    @Override
    public AddressResponseDto getCurrentAddress(long id) {
        var addressById = addressRepository.findById(id);
        var addressResponse
                = addressMapper.addressEntityToAddressResponseDto(addressById);
        return addressResponse;
    }

    @Override
    public List<AddressResponseDto> getAllAddresses() {
        var allAddresses = addressRepository.findAll();
        return addressMapper.getAllAddresses(allAddresses);
    }
}
