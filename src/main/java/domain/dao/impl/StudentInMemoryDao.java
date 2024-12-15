package domain.dao.impl;

import domain.dao.StudentDao;
import domain.entity.StudentEntity;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class StudentInMemoryDao extends StudentDao {

    private static final Set<StudentEntity> STUDENTS =new HashSet<>();
    private final AtomicLong counter=new AtomicLong(0);

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        STUDENTS.add(studentEntity);
        return studentEntity;
    }

    @Override
    public Set<StudentEntity> getAll() {
        return Set.copyOf(STUDENTS);
    }

    @Override
    public Optional<StudentEntity> getById(Long id) {
        return STUDENTS.stream()
                .filter(studentEntity -> studentEntity.getId().equals(id))
                .findFirst();
    }
}
