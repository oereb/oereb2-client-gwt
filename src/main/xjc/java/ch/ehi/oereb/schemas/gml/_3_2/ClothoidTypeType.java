//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClothoidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClothoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;element name="refLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scaleFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="startParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="endParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="clothoid" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothoidType", propOrder = {
    "refLocation",
    "scaleFactor",
    "startParameter",
    "endParameter"
})
public class ClothoidTypeType
    extends AbstractCurveSegmentTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ClothoidTypeType.RefLocation refLocation;
    @XmlElement(required = true)
    protected BigDecimal scaleFactor;
    protected double startParameter;
    protected double endParameter;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationTypeType interpolation;

    /**
     * Gets the value of the refLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ClothoidTypeType.RefLocation }
     *     
     */
    public ClothoidTypeType.RefLocation getRefLocation() {
        return refLocation;
    }

    /**
     * Sets the value of the refLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClothoidTypeType.RefLocation }
     *     
     */
    public void setRefLocation(ClothoidTypeType.RefLocation value) {
        this.refLocation = value;
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaleFactor(BigDecimal value) {
        this.scaleFactor = value;
    }

    /**
     * Gets the value of the startParameter property.
     * 
     */
    public double getStartParameter() {
        return startParameter;
    }

    /**
     * Sets the value of the startParameter property.
     * 
     */
    public void setStartParameter(double value) {
        this.startParameter = value;
    }

    /**
     * Gets the value of the endParameter property.
     * 
     */
    public double getEndParameter() {
        return endParameter;
    }

    /**
     * Sets the value of the endParameter property.
     * 
     */
    public void setEndParameter(double value) {
        this.endParameter = value;
    }

    /**
     * Gets the value of the interpolation property.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationTypeType }
     *     
     */
    public CurveInterpolationTypeType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationTypeType.CLOTHOID;
        } else {
            return interpolation;
        }
    }

    /**
     * Sets the value of the interpolation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationTypeType }
     *     
     */
    public void setInterpolation(CurveInterpolationTypeType value) {
        this.interpolation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affinePlacement"
    })
    public static class RefLocation
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElementRef(name = "AffinePlacement", namespace = "http://www.opengis.net/gml/3.2", type = AffinePlacement.class)
        protected AffinePlacement affinePlacement;

        /**
         * Gets the value of the affinePlacement property.
         * 
         * @return
         *     possible object is
         *     {@link AffinePlacement }
         *     
         */
        public AffinePlacement getAffinePlacement() {
            return affinePlacement;
        }

        /**
         * Sets the value of the affinePlacement property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffinePlacement }
         *     
         */
        public void setAffinePlacement(AffinePlacement value) {
            this.affinePlacement = value;
        }

    }

}
