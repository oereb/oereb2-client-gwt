//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.oereb._1_0.extractdata;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ch.ehi.oereb.schemas.gml._3_2.CurvePropertyTypeType;
import ch.ehi.oereb.schemas.gml._3_2.PointPropertyTypeType;
import ch.ehi.oereb.schemas.gml._3_2.SurfacePropertyTypeType;


/**
 * <p>Java class for Geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geometry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Point" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *           &lt;element name="Line" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *           &lt;element name="Surface" type="{http://www.opengis.net/gml/3.2}SurfacePropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="Lawstatus" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Lawstatus"/>
 *         &lt;element name="MetadataOfGeographicalBaseData" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ResponsibleOffice" type="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}Office"/>
 *         &lt;element ref="{http://schemas.geo.admin.ch/V_D/OeREB/1.0/ExtractData}extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geometry", propOrder = {
    "point",
    "line",
    "surface",
    "lawstatus",
    "metadataOfGeographicalBaseData",
    "responsibleOffice",
    "extensions"
})
public class GeometryType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Point")
    protected PointPropertyTypeType point;
    @XmlElement(name = "Line")
    protected CurvePropertyTypeType line;
    @XmlElement(name = "Surface")
    protected SurfacePropertyTypeType surface;
    @XmlElement(name = "Lawstatus", required = true)
    protected LawstatusType lawstatus;
    @XmlElement(name = "MetadataOfGeographicalBaseData")
    @XmlSchemaType(name = "anyURI")
    protected String metadataOfGeographicalBaseData;
    @XmlElement(name = "ResponsibleOffice", required = true)
    protected OfficeType responsibleOffice;
    protected Extensions extensions;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyTypeType }
     *     
     */
    public PointPropertyTypeType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyTypeType }
     *     
     */
    public void setPoint(PointPropertyTypeType value) {
        this.point = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyTypeType }
     *     
     */
    public CurvePropertyTypeType getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyTypeType }
     *     
     */
    public void setLine(CurvePropertyTypeType value) {
        this.line = value;
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyTypeType }
     *     
     */
    public SurfacePropertyTypeType getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyTypeType }
     *     
     */
    public void setSurface(SurfacePropertyTypeType value) {
        this.surface = value;
    }

    /**
     * Gets the value of the lawstatus property.
     * 
     * @return
     *     possible object is
     *     {@link LawstatusType }
     *     
     */
    public LawstatusType getLawstatus() {
        return lawstatus;
    }

    /**
     * Sets the value of the lawstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LawstatusType }
     *     
     */
    public void setLawstatus(LawstatusType value) {
        this.lawstatus = value;
    }

    /**
     * Gets the value of the metadataOfGeographicalBaseData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataOfGeographicalBaseData() {
        return metadataOfGeographicalBaseData;
    }

    /**
     * Sets the value of the metadataOfGeographicalBaseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataOfGeographicalBaseData(String value) {
        this.metadataOfGeographicalBaseData = value;
    }

    /**
     * Gets the value of the responsibleOffice property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeType }
     *     
     */
    public OfficeType getResponsibleOffice() {
        return responsibleOffice;
    }

    /**
     * Sets the value of the responsibleOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeType }
     *     
     */
    public void setResponsibleOffice(OfficeType value) {
        this.responsibleOffice = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
