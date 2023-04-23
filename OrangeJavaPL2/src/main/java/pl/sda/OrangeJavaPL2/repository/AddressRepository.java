package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Address;

import java.util.List;


@Repository
@RequiredArgsConstructor
public class AddressRepository {

    private final IAddressRepository addressRepository;


    public List<Address> getAllAddress()
    {
        return addressRepository.findAll();
    }

    public void addAddress(Address address)
    {
        addressRepository.save(address);
    }
}
