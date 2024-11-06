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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="dataFeedStatsIntervalMillis" type="{http://www.w3.org/2001/XMLSchema}int" default="2000" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "metrics")
public class Metrics
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlAttribute(name = "dataFeedStatsIntervalMillis")
    protected Integer dataFeedStatsIntervalMillis;

    /**
     * Gets the value of the dataFeedStatsIntervalMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDataFeedStatsIntervalMillis() {
        if (dataFeedStatsIntervalMillis == null) {
            return  2000;
        } else {
            return dataFeedStatsIntervalMillis;
        }
    }

    /**
     * Sets the value of the dataFeedStatsIntervalMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataFeedStatsIntervalMillis(Integer value) {
        this.dataFeedStatsIntervalMillis = value;
    }

}