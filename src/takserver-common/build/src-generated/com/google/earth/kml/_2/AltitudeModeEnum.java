//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.earth.kml._2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for altitudeModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="altitudeModeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="clampToGround"/>
 *     <enumeration value="relativeToGround"/>
 *     <enumeration value="absolute"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "altitudeModeEnum")
@XmlEnum
public enum AltitudeModeEnum {

    @XmlEnumValue("clampToGround")
    CLAMP_TO_GROUND("clampToGround"),
    @XmlEnumValue("relativeToGround")
    RELATIVE_TO_GROUND("relativeToGround"),
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute");
    private final String value;

    AltitudeModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AltitudeModeEnum fromValue(String v) {
        for (AltitudeModeEnum c: AltitudeModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
