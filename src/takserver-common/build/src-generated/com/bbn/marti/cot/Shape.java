//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.bbn.marti.cot;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="link">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="relation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="mime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 <attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ellipse" maxOccurs="2" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="major" use="required" type="{}nonNegativeDecimal" />
 *                 <attribute name="minor" use="required" type="{}nonNegativeDecimal" />
 *                 <attribute name="angle" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 <attribute name="extrude" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="polyline" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="vertex" maxOccurs="unbounded" minOccurs="2">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="lat" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="-90"/>
 *                                 <maxInclusive value="90"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="lon" use="required">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 <minInclusive value="-180"/>
 *                                 <maxInclusive value="180"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="hae" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *                 <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 <attribute name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="dxf" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *                 <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "link",
    "ellipse",
    "polyline",
    "dxf"
})
@XmlRootElement(name = "shape")
public class Shape
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    @XmlElement(required = true)
    protected Shape.Link link;
    protected List<Shape.Ellipse> ellipse;
    protected List<Shape.Polyline> polyline;
    protected Shape.Dxf dxf;
    @XmlAttribute(name = "version")
    protected BigDecimal version;

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Shape.Link }
     *     
     */
    public Shape.Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shape.Link }
     *     
     */
    public void setLink(Shape.Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the ellipse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ellipse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEllipse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shape.Ellipse }
     * 
     * 
     * @return
     *     The value of the ellipse property.
     */
    public List<Shape.Ellipse> getEllipse() {
        if (ellipse == null) {
            ellipse = new ArrayList<>();
        }
        return this.ellipse;
    }

    /**
     * Gets the value of the polyline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the polyline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolyline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shape.Polyline }
     * 
     * 
     * @return
     *     The value of the polyline property.
     */
    public List<Shape.Polyline> getPolyline() {
        if (polyline == null) {
            polyline = new ArrayList<>();
        }
        return this.polyline;
    }

    /**
     * Gets the value of the dxf property.
     * 
     * @return
     *     possible object is
     *     {@link Shape.Dxf }
     *     
     */
    public Shape.Dxf getDxf() {
        return dxf;
    }

    /**
     * Sets the value of the dxf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shape.Dxf }
     *     
     */
    public void setDxf(Shape.Dxf value) {
        this.dxf = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
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
     *       <sequence>
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Dxf
        implements Serializable
    {

        private static final long serialVersionUID = 6107951534079953L;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "level")
        protected BigInteger level;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
        }

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
     *       <sequence>
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="major" use="required" type="{}nonNegativeDecimal" />
     *       <attribute name="minor" use="required" type="{}nonNegativeDecimal" />
     *       <attribute name="angle" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       <attribute name="extrude" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Ellipse
        implements Serializable
    {

        private static final long serialVersionUID = 6107951534079953L;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "major", required = true)
        protected BigDecimal major;
        @XmlAttribute(name = "minor", required = true)
        protected BigDecimal minor;
        @XmlAttribute(name = "angle", required = true)
        protected BigDecimal angle;
        @XmlAttribute(name = "level")
        protected BigInteger level;
        @XmlAttribute(name = "extrude")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger extrude;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

        /**
         * Gets the value of the major property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMajor() {
            return major;
        }

        /**
         * Sets the value of the major property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMajor(BigDecimal value) {
            this.major = value;
        }

        /**
         * Gets the value of the minor property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinor() {
            return minor;
        }

        /**
         * Sets the value of the minor property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinor(BigDecimal value) {
            this.minor = value;
        }

        /**
         * Gets the value of the angle property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAngle() {
            return angle;
        }

        /**
         * Sets the value of the angle property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAngle(BigDecimal value) {
            this.angle = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
        }

        /**
         * Gets the value of the extrude property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getExtrude() {
            return extrude;
        }

        /**
         * Sets the value of the extrude property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setExtrude(BigInteger value) {
            this.extrude = value;
        }

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
     *       <sequence>
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *       <attribute name="relation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="remarks" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="mime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       <attribute name="version" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Link
        implements Serializable
    {

        private static final long serialVersionUID = 6107951534079953L;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "relation", required = true)
        protected String relation;
        @XmlAttribute(name = "uid", required = true)
        protected String uid;
        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "remarks")
        protected String remarks;
        @XmlAttribute(name = "mime")
        protected String mime;
        @XmlAttribute(name = "version")
        protected BigDecimal version;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

        /**
         * Gets the value of the relation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelation() {
            return relation;
        }

        /**
         * Sets the value of the relation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelation(String value) {
            this.relation = value;
        }

        /**
         * Gets the value of the uid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUid() {
            return uid;
        }

        /**
         * Sets the value of the uid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUid(String value) {
            this.uid = value;
        }

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
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the mime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMime() {
            return mime;
        }

        /**
         * Sets the value of the mime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMime(String value) {
            this.mime = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

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
     *       <sequence>
     *         <element name="vertex" maxOccurs="unbounded" minOccurs="2">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="lat" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="-90"/>
     *                       <maxInclusive value="90"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="lon" use="required">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       <minInclusive value="-180"/>
     *                       <maxInclusive value="180"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="hae" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *       <attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       <attribute name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vertex"
    })
    public static class Polyline
        implements Serializable
    {

        private static final long serialVersionUID = 6107951534079953L;
        @XmlElement(required = true)
        protected List<Shape.Polyline.Vertex> vertex;
        @XmlAttribute(name = "level")
        protected BigInteger level;
        @XmlAttribute(name = "closed")
        protected Boolean closed;

        /**
         * Gets the value of the vertex property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the vertex property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVertex().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Shape.Polyline.Vertex }
         * 
         * 
         * @return
         *     The value of the vertex property.
         */
        public List<Shape.Polyline.Vertex> getVertex() {
            if (vertex == null) {
                vertex = new ArrayList<>();
            }
            return this.vertex;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
        }

        /**
         * Gets the value of the closed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isClosed() {
            if (closed == null) {
                return true;
            } else {
                return closed;
            }
        }

        /**
         * Sets the value of the closed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setClosed(Boolean value) {
            this.closed = value;
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
         *       <attribute name="lat" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="-90"/>
         *             <maxInclusive value="90"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="lon" use="required">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             <minInclusive value="-180"/>
         *             <maxInclusive value="180"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="hae" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Vertex
            implements Serializable
        {

            private static final long serialVersionUID = 6107951534079953L;
            @XmlAttribute(name = "lat", required = true)
            protected BigDecimal lat;
            @XmlAttribute(name = "lon", required = true)
            protected BigDecimal lon;
            @XmlAttribute(name = "hae")
            protected BigDecimal hae;

            /**
             * Gets the value of the lat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLat() {
                return lat;
            }

            /**
             * Sets the value of the lat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLat(BigDecimal value) {
                this.lat = value;
            }

            /**
             * Gets the value of the lon property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLon() {
                return lon;
            }

            /**
             * Sets the value of the lon property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLon(BigDecimal value) {
                this.lon = value;
            }

            /**
             * Gets the value of the hae property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHae() {
                return hae;
            }

            /**
             * Sets the value of the hae property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHae(BigDecimal value) {
                this.hae = value;
            }

        }

    }

}
