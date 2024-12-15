package domain.dao;

import java.util.Collection;
import java.util.Optional;

public interface Dao<E,I> {
        E save(E t);

        Collection<E> getAll();

        Optional<E> getById(I id);



}
