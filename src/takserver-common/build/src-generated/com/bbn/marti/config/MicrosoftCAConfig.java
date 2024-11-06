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
import jakarta.xml.bind.annotation.XmlType;


/**
 * Configuration for Microsoft CA Certificate Enrollment Services
 * 
 * <p>Java class for MicrosoftCAConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MicrosoftCAConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="truststore" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="truststorePass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="svcUrl" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="templateName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="trustAllHosts" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrosoftCAConfig")
public class MicrosoftCAConfig
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlAttribute(name = "username", required = true)
    protected String username;
    @XmlAttribute(name = "password", required = true)
    protected String password;
    @XmlAttribute(name = "truststore", required = true)
    protected String truststore;
    @XmlAttribute(name = "truststorePass", required = true)
    protected String truststorePass;
    @XmlAttribute(name = "svcUrl", required = true)
    protected String svcUrl;
    @XmlAttribute(name = "templateName", required = true)
    protected String templateName;
    @XmlAttribute(name = "trustAllHosts")
    protected Boolean trustAllHosts;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the truststore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruststore() {
        return truststore;
    }

    /**
     * Sets the value of the truststore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruststore(String value) {
        this.truststore = value;
    }

    /**
     * Gets the value of the truststorePass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruststorePass() {
        return truststorePass;
    }

    /**
     * Sets the value of the truststorePass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruststorePass(String value) {
        this.truststorePass = value;
    }

    /**
     * Gets the value of the svcUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcUrl() {
        return svcUrl;
    }

    /**
     * Sets the value of the svcUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcUrl(String value) {
        this.svcUrl = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the trustAllHosts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTrustAllHosts() {
        if (trustAllHosts == null) {
            return false;
        } else {
            return trustAllHosts;
        }
    }

    /**
     * Sets the value of the trustAllHosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrustAllHosts(Boolean value) {
        this.trustAllHosts = value;
    }

}
