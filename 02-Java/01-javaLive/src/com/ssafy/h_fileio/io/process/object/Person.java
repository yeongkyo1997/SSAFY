package com.ssafy.h_fileio.io.process.object;

import java.io.Serializable;

// TODO: Person 을 직렬화 가능하도록 처리하시오.
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private transient String pass;

    public Person(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", pass=" + pass + "]";
    }

}
