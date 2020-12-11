package ru.tembaster.model;

import javax.persistence.*;

@MappedSuperclass
public class AbstractNamedEntity extends AbstractBaseEntity {

    @Column(name = "name", nullable = false)
    protected String name;

    protected AbstractNamedEntity() {
    }

    public AbstractNamedEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
