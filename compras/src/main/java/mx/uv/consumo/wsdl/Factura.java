
package mx.uv.consumo.wsdl;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Sello" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Certificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CondicionesDePago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TipoDeComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Exportacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LugarExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfcEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscalEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RfcReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegimenFiscalReceptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsoCFDI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjetoImp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaveProdServ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ClaveUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorUnitario" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DescuentoConcepto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="BaseTraslado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaOCuota" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ImporteTraslado" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Factura", propOrder = {
    "id",
    "version",
    "serie",
    "folio",
    "fecha",
    "sello",
    "formaPago",
    "noCertificado",
    "certificado",
    "condicionesDePago",
    "subTotal",
    "descuento",
    "moneda",
    "total",
    "tipoDeComprobante",
    "exportacion",
    "metodoPago",
    "lugarExpedicion",
    "rfcEmisor",
    "nombreEmisor",
    "regimenFiscalEmisor",
    "rfcReceptor",
    "nombreReceptor",
    "domicilioFiscalReceptor",
    "regimenFiscalReceptor",
    "usoCFDI",
    "objetoImp",
    "claveProdServ",
    "cantidad",
    "claveUnidad",
    "unidad",
    "descripcion",
    "valorUnitario",
    "importe",
    "descuentoConcepto",
    "baseTraslado",
    "impuesto",
    "tipoFactor",
    "tasaOCuota",
    "importeTraslado"
})
public class Factura {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "Folio")
    protected String folio;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Sello")
    protected String sello;
    @XmlElement(name = "FormaPago")
    protected String formaPago;
    @XmlElement(name = "NoCertificado")
    protected String noCertificado;
    @XmlElement(name = "Certificado")
    protected String certificado;
    @XmlElement(name = "CondicionesDePago")
    protected String condicionesDePago;
    @XmlElement(name = "SubTotal", required = true)
    protected BigDecimal subTotal;
    @XmlElement(name = "Descuento", required = true, nillable = true)
    protected BigDecimal descuento;
    @XmlElement(name = "Moneda")
    protected String moneda;
    @XmlElement(name = "Total", required = true)
    protected BigDecimal total;
    @XmlElement(name = "TipoDeComprobante")
    protected String tipoDeComprobante;
    @XmlElement(name = "Exportacion")
    protected String exportacion;
    @XmlElement(name = "MetodoPago")
    protected String metodoPago;
    @XmlElement(name = "LugarExpedicion")
    protected String lugarExpedicion;
    @XmlElement(name = "RfcEmisor")
    protected String rfcEmisor;
    @XmlElement(name = "NombreEmisor")
    protected String nombreEmisor;
    @XmlElement(name = "RegimenFiscalEmisor")
    protected String regimenFiscalEmisor;
    @XmlElement(name = "RfcReceptor")
    protected String rfcReceptor;
    @XmlElement(name = "NombreReceptor")
    protected String nombreReceptor;
    @XmlElement(name = "DomicilioFiscalReceptor")
    protected String domicilioFiscalReceptor;
    @XmlElement(name = "RegimenFiscalReceptor")
    protected String regimenFiscalReceptor;
    @XmlElement(name = "UsoCFDI")
    protected String usoCFDI;
    @XmlElement(name = "ObjetoImp")
    protected String objetoImp;
    @XmlElement(name = "ClaveProdServ")
    protected String claveProdServ;
    @XmlElement(name = "Cantidad", required = true)
    protected BigDecimal cantidad;
    @XmlElement(name = "ClaveUnidad")
    protected String claveUnidad;
    @XmlElement(name = "Unidad")
    protected String unidad;
    @XmlElement(name = "Descripcion")
    protected String descripcion;
    @XmlElement(name = "ValorUnitario", required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(name = "Importe", required = true)
    protected BigDecimal importe;
    @XmlElement(name = "DescuentoConcepto", required = true, nillable = true)
    protected BigDecimal descuentoConcepto;
    @XmlElement(name = "BaseTraslado", required = true)
    protected BigDecimal baseTraslado;
    @XmlElement(name = "Impuesto")
    protected String impuesto;
    @XmlElement(name = "TipoFactor")
    protected String tipoFactor;
    @XmlElement(name = "TasaOCuota", required = true)
    protected BigDecimal tasaOCuota;
    @XmlElement(name = "ImporteTraslado", required = true)
    protected BigDecimal importeTraslado;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSello(String value) {
        this.sello = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCertificado(String value) {
        this.noCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificado(String value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesDePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionesDePago(String value) {
        this.condicionesDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubTotal(BigDecimal value) {
        this.subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuento(BigDecimal value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeComprobante(String value) {
        this.tipoDeComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacion() {
        return exportacion;
    }

    /**
     * Define el valor de la propiedad exportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacion(String value) {
        this.exportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarExpedicion(String value) {
        this.lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcEmisor() {
        return rfcEmisor;
    }

    /**
     * Define el valor de la propiedad rfcEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcEmisor(String value) {
        this.rfcEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmisor() {
        return nombreEmisor;
    }

    /**
     * Define el valor de la propiedad nombreEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmisor(String value) {
        this.nombreEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalEmisor() {
        return regimenFiscalEmisor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalEmisor(String value) {
        this.regimenFiscalEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad rfcReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcReceptor() {
        return rfcReceptor;
    }

    /**
     * Define el valor de la propiedad rfcReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcReceptor(String value) {
        this.rfcReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReceptor() {
        return nombreReceptor;
    }

    /**
     * Define el valor de la propiedad nombreReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReceptor(String value) {
        this.nombreReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioFiscalReceptor() {
        return domicilioFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad domicilioFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioFiscalReceptor(String value) {
        this.domicilioFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad regimenFiscalReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimenFiscalReceptor() {
        return regimenFiscalReceptor;
    }

    /**
     * Define el valor de la propiedad regimenFiscalReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimenFiscalReceptor(String value) {
        this.regimenFiscalReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad usoCFDI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsoCFDI() {
        return usoCFDI;
    }

    /**
     * Define el valor de la propiedad usoCFDI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsoCFDI(String value) {
        this.usoCFDI = value;
    }

    /**
     * Obtiene el valor de la propiedad objetoImp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoImp() {
        return objetoImp;
    }

    /**
     * Define el valor de la propiedad objetoImp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoImp(String value) {
        this.objetoImp = value;
    }

    /**
     * Obtiene el valor de la propiedad claveProdServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveProdServ() {
        return claveProdServ;
    }

    /**
     * Define el valor de la propiedad claveProdServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveProdServ(String value) {
        this.claveProdServ = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad claveUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * Define el valor de la propiedad claveUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveUnidad(String value) {
        this.claveUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define el valor de la propiedad valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporte(BigDecimal value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoConcepto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDescuentoConcepto() {
        return descuentoConcepto;
    }

    /**
     * Define el valor de la propiedad descuentoConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDescuentoConcepto(BigDecimal value) {
        this.descuentoConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad baseTraslado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTraslado() {
        return baseTraslado;
    }

    /**
     * Define el valor de la propiedad baseTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTraslado(BigDecimal value) {
        this.baseTraslado = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpuesto(String value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactor() {
        return tipoFactor;
    }

    /**
     * Define el valor de la propiedad tipoFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactor(String value) {
        this.tipoFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaOCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaOCuota() {
        return tasaOCuota;
    }

    /**
     * Define el valor de la propiedad tasaOCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaOCuota(BigDecimal value) {
        this.tasaOCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTraslado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTraslado() {
        return importeTraslado;
    }

    /**
     * Define el valor de la propiedad importeTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTraslado(BigDecimal value) {
        this.importeTraslado = value;
    }

}
