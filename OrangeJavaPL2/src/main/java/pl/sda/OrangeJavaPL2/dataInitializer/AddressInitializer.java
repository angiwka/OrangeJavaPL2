package pl.sda.OrangeJavaPL2.dataInitializer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class AddressInitializer {

    private final AddressRepository addressRepository;
    @PostConstruct
    public void initAddress(){
        Address address = new Address("Sloneczna", 1L, "27-600", "Poland");
        Address address1 = new Address("Dzielna", 11L, "01-023", "Poland");

        addressRepository.addAddress(address);
        addressRepository.addAddress(address1);

    }
}
