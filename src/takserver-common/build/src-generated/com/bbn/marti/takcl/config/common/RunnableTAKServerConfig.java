//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.takcl.config.common;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * TAKCL TAK server configuration
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="modelServerDir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="jarName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="configFile" type="{http://www.w3.org/2001/XMLSchema}string" default="CoreConfig.xml" />
 *       <attribute name="TAKIgniteConfigFile" type="{http://www.w3.org/2001/XMLSchema}string" default="TAKIgniteConfig.xml" />
 *       <attribute name="userFile" type="{http://www.w3.org/2001/XMLSchema}string" default="UserAuthenticationFile.xml" />
 *       <attribute name="cleanConfigFile" type="{http://www.w3.org/2001/XMLSchema}string" default="CoreConfig.example.xml" />
 *       <attribute name="cleanTAKIgniteConfigFile" type="{http://www.w3.org/2001/XMLSchema}string" default="TAKIgniteConfig.example.xml" />
 *       <attribute name="serverFarmDir" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="certificateDirectory" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="certToolDirectory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RunnableTAKServerConfig")
public class RunnableTAKServerConfig
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlAttribute(name = "modelServerDir", required = true)
    protected String modelServerDir;
    @XmlAttribute(name = "jarName", required = true)
    protected String jarName;
    @XmlAttribute(name = "configFile")
    protected String configFile;
    @XmlAttribute(name = "TAKIgniteConfigFile")
    protected String takIgniteConfigFile;
    @XmlAttribute(name = "userFile")
    protected String userFile;
    @XmlAttribute(name = "cleanConfigFile")
    protected String cleanConfigFile;
    @XmlAttribute(name = "cleanTAKIgniteConfigFile")
    protected String cleanTAKIgniteConfigFile;
    @XmlAttribute(name = "serverFarmDir", required = true)
    protected String serverFarmDir;
    @XmlAttribute(name = "certificateDirectory", required = true)
    protected String certificateDirectory;
    @XmlAttribute(name = "certToolDirectory")
    protected String certToolDirectory;

    /**
     * Gets the value of the modelServerDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelServerDir() {
        return modelServerDir;
    }

    /**
     * Sets the value of the modelServerDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelServerDir(String value) {
        this.modelServerDir = value;
    }

    /**
     * Gets the value of the jarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJarName() {
        return jarName;
    }

    /**
     * Sets the value of the jarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJarName(String value) {
        this.jarName = value;
    }

    /**
     * Gets the value of the configFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigFile() {
        if (configFile == null) {
            return "CoreConfig.xml";
        } else {
            return configFile;
        }
    }

    /**
     * Sets the value of the configFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigFile(String value) {
        this.configFile = value;
    }

    /**
     * Gets the value of the takIgniteConfigFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAKIgniteConfigFile() {
        if (takIgniteConfigFile == null) {
            return "TAKIgniteConfig.xml";
        } else {
            return takIgniteConfigFile;
        }
    }

    /**
     * Sets the value of the takIgniteConfigFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAKIgniteConfigFile(String value) {
        this.takIgniteConfigFile = value;
    }

    /**
     * Gets the value of the userFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFile() {
        if (userFile == null) {
            return "UserAuthenticationFile.xml";
        } else {
            return userFile;
        }
    }

    /**
     * Sets the value of the userFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFile(String value) {
        this.userFile = value;
    }

    /**
     * Gets the value of the cleanConfigFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanConfigFile() {
        if (cleanConfigFile == null) {
            return "CoreConfig.example.xml";
        } else {
            return cleanConfigFile;
        }
    }

    /**
     * Sets the value of the cleanConfigFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanConfigFile(String value) {
        this.cleanConfigFile = value;
    }

    /**
     * Gets the value of the cleanTAKIgniteConfigFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanTAKIgniteConfigFile() {
        if (cleanTAKIgniteConfigFile == null) {
            return "TAKIgniteConfig.example.xml";
        } else {
            return cleanTAKIgniteConfigFile;
        }
    }

    /**
     * Sets the value of the cleanTAKIgniteConfigFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanTAKIgniteConfigFile(String value) {
        this.cleanTAKIgniteConfigFile = value;
    }

    /**
     * Gets the value of the serverFarmDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerFarmDir() {
        return serverFarmDir;
    }

    /**
     * Sets the value of the serverFarmDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerFarmDir(String value) {
        this.serverFarmDir = value;
    }

    /**
     * Gets the value of the certificateDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateDirectory() {
        return certificateDirectory;
    }

    /**
     * Sets the value of the certificateDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateDirectory(String value) {
        this.certificateDirectory = value;
    }

    /**
     * Gets the value of the certToolDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertToolDirectory() {
        return certToolDirectory;
    }

    /**
     * Sets the value of the certToolDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertToolDirectory(String value) {
        this.certToolDirectory = value;
    }

}