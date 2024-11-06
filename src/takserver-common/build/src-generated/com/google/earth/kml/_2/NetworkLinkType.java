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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkLinkType">
 *   <complexContent>
 *     <extension base="{http://earth.google.com/kml/2.1}FeatureType">
 *       <sequence>
 *         <element name="refreshVisibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="flyToView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://earth.google.com/kml/2.1}Link"/>
 *           <element name="Url" type="{http://earth.google.com/kml/2.1}LinkType"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLinkType", propOrder = {
    "refreshVisibility",
    "flyToView",
    "link",
    "url"
})
public class NetworkLinkType
    extends FeatureType
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlElement(defaultValue = "0")
    protected Boolean refreshVisibility;
    @XmlElement(defaultValue = "0")
    protected Boolean flyToView;
    @XmlElement(name = "Link")
    protected LinkType link;
    @XmlElement(name = "Url")
    protected LinkType url;

    /**
     * Gets the value of the refreshVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshVisibility() {
        return refreshVisibility;
    }

    /**
     * Sets the value of the refreshVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshVisibility(Boolean value) {
        this.refreshVisibility = value;
    }

    /**
     * Gets the value of the flyToView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlyToView() {
        return flyToView;
    }

    /**
     * Sets the value of the flyToView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlyToView(Boolean value) {
        this.flyToView = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setLink(LinkType value) {
        this.link = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setUrl(LinkType value) {
        this.url = value;
    }

}
