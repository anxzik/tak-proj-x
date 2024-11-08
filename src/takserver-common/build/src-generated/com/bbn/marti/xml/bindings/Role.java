//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.xml.bindings;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Role">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROLE_NONEXISTENT"/>
 *     <enumeration value="ROLE_ADMIN"/>
 *     <enumeration value="ROLE_READONLY"/>
 *     <enumeration value="ROLE_ANONYMOUS"/>
 *     <enumeration value="ROLE_NON_ADMIN_UI"/>
 *     <enumeration value="ROLE_WEBTAK"/>
 *     <enumeration value="ROLE_NON_ADMIN_UI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Role")
@XmlEnum
public enum Role {

    ROLE_NONEXISTENT,
    ROLE_ADMIN,
    ROLE_READONLY,
    ROLE_ANONYMOUS,
    ROLE_NON_ADMIN_UI,
    ROLE_WEBTAK;

    public String value() {
        return name();
    }

    public static Role fromValue(String v) {
        return valueOf(v);
    }

}
