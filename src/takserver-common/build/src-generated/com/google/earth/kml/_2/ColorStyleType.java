//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.earth.kml._2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ColorStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ColorStyleType">
 *   <complexContent>
 *     <extension base="{http://earth.google.com/kml/2.1}ObjectType">
 *       <sequence>
 *         <element name="color" type="{http://earth.google.com/kml/2.1}color" minOccurs="0"/>
 *         <element name="colorMode" type="{http://earth.google.com/kml/2.1}colorModeEnum" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorStyleType", propOrder = {
    "color",
    "colorMode"
})
@XmlSeeAlso({
    IconStyleType.class,
    LabelStyleType.class,
    LineStyleType.class,
    PolyStyleType.class
})
public abstract class ColorStyleType
    extends ObjectType
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlElement(type = String.class, defaultValue = "ffffffff")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] color;
    @XmlElement(defaultValue = "normal")
    @XmlSchemaType(name = "string")
    protected ColorModeEnum colorMode;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(byte[] value) {
        this.color = value;
    }

    /**
     * Gets the value of the colorMode property.
     * 
     * @return
     *     possible object is
     *     {@link ColorModeEnum }
     *     
     */
    public ColorModeEnum getColorMode() {
        return colorMode;
    }

    /**
     * Sets the value of the colorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorModeEnum }
     *     
     */
    public void setColorMode(ColorModeEnum value) {
        this.colorMode = value;
    }

}