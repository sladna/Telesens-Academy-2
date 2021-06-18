package com.annasladkykh.lesson4;

public enum Gender {
    MALE("m"),
    FEMALE("f");

    private String ruValue;

    Gender(String ruValue) {
        this.ruValue = ruValue;
    }

    public static Gender parse(String val) {
        if ("f".equals(val))
            return FEMALE;
        else
            return MALE;
    }

    @Override
    public String toString() {
        if (this == MALE)
            return "m";
        else
            return "f";
    }
}
