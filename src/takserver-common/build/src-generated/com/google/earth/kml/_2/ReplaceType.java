//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.earth.kml._2;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReplaceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://earth.google.com/kml/2.1}Feature" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplaceType", propOrder = {
    "feature"
})
public class ReplaceType implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlElementRef(name = "Feature", namespace = "http://earth.google.com/kml/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends FeatureType> feature;

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FolderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundOverlayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkLinkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlacemarkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScreenOverlayType }{@code >}
     *     
     */
    public JAXBElement<? extends FeatureType> getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FolderType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GroundOverlayType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkLinkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PlacemarkType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScreenOverlayType }{@code >}
     *     
     */
    public void setFeature(JAXBElement<? extends FeatureType> value) {
        this.feature = value;
    }

}
