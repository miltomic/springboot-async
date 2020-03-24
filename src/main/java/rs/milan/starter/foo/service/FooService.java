package rs.milan.starter.foo.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class FooService {

    private final ModelMapper mapper;

    @Async
    public CompletableFuture<List<FooDto>> fetchAllFoos() {
        ArrayList<FooDto> fooDtos = new ArrayList<>();
        fooDtos.add(new FooDto("Foo", true));
        return CompletableFuture.completedFuture(fooDtos);
    }

}
