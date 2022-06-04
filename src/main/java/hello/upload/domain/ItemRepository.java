package hello.upload.domain;

import java.util.Optional;

public interface ItemRepository {
    public Item save(Item item);
    public Optional<Item> findById(Long id);
}
