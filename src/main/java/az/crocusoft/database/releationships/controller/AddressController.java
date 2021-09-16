package az.crocusoft.database.releationships.controller;

import az.crocusoft.database.releationships.dao.entity.Address;
import az.crocusoft.database.releationships.dto.request.AddressRequestDto;
import az.crocusoft.database.releationships.dto.response.AddressResponseDto;
import az.crocusoft.database.releationships.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("addresses")
    public long saveNewAddress(
            @RequestBody AddressRequestDto addressRequestDto) {
        return addressService.saveNewAddress(addressRequestDto);
    }

    @GetMapping("addresses/{id}")
    public AddressResponseDto getAddress(@PathVariable long id) {
        return addressService.getCurrentAddress(id);
    }

    @GetMapping("/addresses")
    public List<Address> getAllAddress() {
        return addressService.getAllAddresses();
    }
}
