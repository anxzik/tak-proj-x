//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *       <sequence maxOccurs="unbounded" minOccurs="0">
 *         <element name="typefilter">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="threshold" type="{http://www.w3.org/2001/XMLSchema}int" default="30" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "typefilter"
})
@XmlRootElement(name = "dropfilter")
public class Dropfilter
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    protected List<Dropfilter.Typefilter> typefilter;

    /**
     * Gets the value of the typefilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the typefilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypefilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dropfilter.Typefilter }
     * 
     * 
     * @return
     *     The value of the typefilter property.
     */
    public List<Dropfilter.Typefilter> getTypefilter() {
        if (typefilter == null) {
            typefilter = new ArrayList<>();
        }
        return this.typefilter;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="threshold" type="{http://www.w3.org/2001/XMLSchema}int" default="30" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Typefilter
        implements Serializable
    {

        private static final long serialVersionUID = 6107951534079953L;
        @XmlAttribute(name = "type")
        protected String type;
        @XmlAttribute(name = "detail")
        protected String detail;
        @XmlAttribute(name = "threshold")
        protected Integer threshold;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the detail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetail() {
            return detail;
        }

        /**
         * Sets the value of the detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetail(String value) {
            this.detail = value;
        }

        /**
         * Gets the value of the threshold property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getThreshold() {
            if (threshold == null) {
                return  30;
            } else {
                return threshold;
            }
        }

        /**
         * Sets the value of the threshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setThreshold(Integer value) {
            this.threshold = value;
        }

    }

}