//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.takcl.config.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="authType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="file"/>
 *     <enumeration value="anonymous"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "authType")
@XmlEnum
public enum AuthType {

    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("anonymous")
    ANONYMOUS("anonymous");
    private final String value;

    AuthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthType fromValue(String v) {
        for (AuthType c: AuthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
