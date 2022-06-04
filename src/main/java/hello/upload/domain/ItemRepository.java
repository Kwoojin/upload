package hello.upload.domain;

import java.util.Optional;

public interface ItemRepository {

    public Item Save(Item item);

    public Optional<Item> findById(Long id);
}
