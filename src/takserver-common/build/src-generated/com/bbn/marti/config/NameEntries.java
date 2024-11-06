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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nameEntries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="nameEntries">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nameEntry" type="{http://bbn.com/marti/xml/config}nameEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameEntries", propOrder = {
    "nameEntry"
})
public class NameEntries
    implements Serializable
{

    private static final long serialVersionUID = 6107951534079953L;
    protected List<NameEntry> nameEntry;

    /**
     * Gets the value of the nameEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nameEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameEntry }
     * 
     * 
     * @return
     *     The value of the nameEntry property.
     */
    public List<NameEntry> getNameEntry() {
        if (nameEntry == null) {
            nameEntry = new ArrayList<>();
        }
        return this.nameEntry;
    }

}
