//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.takcl.config.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TakclRunMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TakclRunMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REMOTE_SERVER_INTERACTION"/>
 *     <enumeration value="LOCAL_SERVER_INTERACTION"/>
 *     <enumeration value="LOCAL_SOURCE_INTERACTION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TakclRunMode")
@XmlEnum
public enum TakclRunMode {

    REMOTE_SERVER_INTERACTION,
    LOCAL_SERVER_INTERACTION,
    LOCAL_SOURCE_INTERACTION;

    public String value() {
        return name();
    }

    public static TakclRunMode fromValue(String v) {
        return valueOf(v);
    }

}