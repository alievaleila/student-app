package domain.entity;

import java.util.Objects;

public class StudentEntity implements Comparable<StudentEntity> {
    private Long id;
    private String pin;
    private String name;
    private Double grade;
    private Integer age;

    public StudentEntity() {
    }

    public StudentEntity(String pin, String name, Double grade, Integer age) {
        this(null, pin, name, grade, age);
    }

    public StudentEntity(Long id, String pin, String name, Double grade, Integer age) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(pin, that.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pin);
    }

    @Override
    public int compareTo(StudentEntity that) {
        return Long.compare(this.id,that.id);
    }
}
