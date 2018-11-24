package org.snowolf.chipmunk.domain;

import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = 4701173275698616503L;

    private long id;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
