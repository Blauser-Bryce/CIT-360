/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Bryce Blauser
 */

@SuppressWarnings("serial")
public class QCJSONObject implements Serializable {
    
    private String name;
    private int age;
    private Date birthdate;

    public QCJSONObject(String aString, int anInt, Date aDate) {
        name = aString;
        age = anInt;
        birthdate = aDate;
    }

    public QCJSONObject(HashMap aMapRepresentation){
        this.name = (String)aMapRepresentation.get("name");
        //dates are stored as timestamp strings.
        String stampString = (String)aMapRepresentation.get("birthdate");
        this.birthdate = new Date(Timestamp.valueOf(stampString).getTime());
        //numbers are stored as longs or doubles.
        Long asLong = (Long)aMapRepresentation.get("age");
        this.age = asLong.intValue();
    }

}
