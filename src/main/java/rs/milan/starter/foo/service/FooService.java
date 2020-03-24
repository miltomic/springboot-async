package rs.milan.starter.foo.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FooService {

    private final ModelMapper mapper;

    public List<FooDto> fetchAllFoos() {
        ArrayList<FooDto> fooDtos = new ArrayList<>();
        fooDtos.add(new FooDto("Foo", true));
        return fooDtos;
    }

}
