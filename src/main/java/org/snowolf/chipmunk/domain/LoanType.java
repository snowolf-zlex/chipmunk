/**
 *
 */
package org.snowolf.chipmunk.domain;

import java.io.Serializable;

/**
 * @author Snowolf
 */
public class LoanType implements Serializable {

    private static final long serialVersionUID = 2568669571307575914L;

    private long id;
    private String name;

    public LoanType() {
    }

    public LoanType(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
