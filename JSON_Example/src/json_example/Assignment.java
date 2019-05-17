/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

/**
 *
 * @author Bryce Blauser
 */
public class Assignment {
    
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
      return String.format("[%d] %s", id, name);
    }
}
