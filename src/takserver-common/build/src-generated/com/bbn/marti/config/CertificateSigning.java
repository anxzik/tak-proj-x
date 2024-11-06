//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.config;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Configuration for Certificate Signing
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="certificateConfig" type="{http://bbn.com/marti/xml/config}certificateConfig"/>
 *         <element name="TAKServerCAConfig" type="{http://bbn.com/marti/xml/config}TAKServerCAConfig" minOccurs="0"/>
 *         <element name="MicrosoftCAConfig" type="{http://bbn.com/marti/xml/config}MicrosoftCAConfig" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="CA" use="required" type="{http://bbn.com/marti/xml/config}CAType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certificateConfig",
    "takServerCAConfig",
    "microsoftCAConfig"
})
@XmlRootElement(name = "certificateSigning")
public class CertificateSigning
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlElement(required = true)
    protected CertificateConfig certificateConfig;
    @XmlElement(name = "TAKServerCAConfig")
    protected TAKServerCAConfig takServerCAConfig;
    @XmlElement(name = "MicrosoftCAConfig")
    protected MicrosoftCAConfig microsoftCAConfig;
    @XmlAttribute(name = "CA", required = true)
    protected CAType ca;

    /**
     * Gets the value of the certificateConfig property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConfig }
     *     
     */
    public CertificateConfig getCertificateConfig() {
        return certificateConfig;
    }

    /**
     * Sets the value of the certificateConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConfig }
     *     
     */
    public void setCertificateConfig(CertificateConfig value) {
        this.certificateConfig = value;
    }

    /**
     * Gets the value of the takServerCAConfig property.
     * 
     * @return
     *     possible object is
     *     {@link TAKServerCAConfig }
     *     
     */
    public TAKServerCAConfig getTAKServerCAConfig() {
        return takServerCAConfig;
    }

    /**
     * Sets the value of the takServerCAConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAKServerCAConfig }
     *     
     */
    public void setTAKServerCAConfig(TAKServerCAConfig value) {
        this.takServerCAConfig = value;
    }

    /**
     * Gets the value of the microsoftCAConfig property.
     * 
     * @return
     *     possible object is
     *     {@link MicrosoftCAConfig }
     *     
     */
    public MicrosoftCAConfig getMicrosoftCAConfig() {
        return microsoftCAConfig;
    }

    /**
     * Sets the value of the microsoftCAConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrosoftCAConfig }
     *     
     */
    public void setMicrosoftCAConfig(MicrosoftCAConfig value) {
        this.microsoftCAConfig = value;
    }

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link CAType }
     *     
     */
    public CAType getCA() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAType }
     *     
     */
    public void setCA(CAType value) {
        this.ca = value;
    }

}