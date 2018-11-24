package org.snowolf.chipmunk.domain;

import java.io.Serializable;
import java.util.List;


public class Role implements Serializable {

    private static final long serialVersionUID = 3575296970360165172L;
    private long id;
    private String name;
    private String code;
    private List<Permission> permissionList;

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

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
