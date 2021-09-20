package az.crocusoft.database.relationships.controller;

import az.crocusoft.database.relationships.dto.request.AddressRequestDto;
import az.crocusoft.database.relationships.dto.response.AddressResponseDto;
import az.crocusoft.database.relationships.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping("addresses")
    public long saveNewAddress(@RequestBody AddressRequestDto addressRequestDto) {
        return addressService.saveNewAddress(addressRequestDto);
    }

    @GetMapping("addresses/{id}")
    public AddressResponseDto getAddress(@PathVariable long id) {
        return addressService.getCurrentAddress(id);
    }

    @GetMapping("/addresses")
    public List<AddressResponseDto> getAllAddress() {
        return addressService.getAllAddresses();
    }

    @DeleteMapping("/addresses/{id}")
    public void deleteAddress(@PathVariable long id) {
        addressService.deleteCurrentAddress(id);
    }
}
