//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.earth.kml._2;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StyleSelectorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StyleSelectorType">
 *   <complexContent>
 *     <extension base="{http://earth.google.com/kml/2.1}ObjectType">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleSelectorType")
@XmlSeeAlso({
    StyleType.class,
    StyleMapType.class
})
public abstract class StyleSelectorType
    extends ObjectType
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;

}
