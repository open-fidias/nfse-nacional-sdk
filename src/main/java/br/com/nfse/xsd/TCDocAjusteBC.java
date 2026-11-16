//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.11.16 às 04:59:00 PM BRT 
//


package br.com.nfse.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCDocAjusteBC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCDocAjusteBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAjusteBC" type="{http://www.sped.fazenda.gov.br/nfse}TSRTCTpAjusteBC"/>
 *         &lt;element name="xTpAjusteBC" type="{http://www.sped.fazenda.gov.br/nfse}TSDesc150" minOccurs="0"/>
 *         &lt;element name="vTotDoc" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2"/>
 *         &lt;element name="vAjusteAplic" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2"/>
 *         &lt;element name="dtEmiDoc" type="{http://www.sped.fazenda.gov.br/nfse}TSData" minOccurs="0"/>
 *         &lt;element name="dtCompDoc" type="{http://www.sped.fazenda.gov.br/nfse}TSData" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="dFeNacional" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCListaDocDFe"/>
 *           &lt;element name="docFiscalOutro" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCListaDocFiscalOutro"/>
 *           &lt;element name="docOutro" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCListaDocOutro"/>
 *         &lt;/choice>
 *         &lt;element name="fornec" type="{http://www.sped.fazenda.gov.br/nfse}TCInfoPessoa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCDocAjusteBC", propOrder = {
    "tpAjusteBC",
    "xTpAjusteBC",
    "vTotDoc",
    "vAjusteAplic",
    "dtEmiDoc",
    "dtCompDoc",
    "dFeNacional",
    "docFiscalOutro",
    "docOutro",
    "fornec"
})
public class TCDocAjusteBC {

    @XmlElement(required = true)
    protected String tpAjusteBC;
    protected String xTpAjusteBC;
    @XmlElement(required = true)
    protected String vTotDoc;
    @XmlElement(required = true)
    protected String vAjusteAplic;
    protected String dtEmiDoc;
    protected String dtCompDoc;
    protected TCRTCListaDocDFe dFeNacional;
    protected TCRTCListaDocFiscalOutro docFiscalOutro;
    protected TCRTCListaDocOutro docOutro;
    protected TCInfoPessoa fornec;

    /**
     * Obtém o valor da propriedade tpAjusteBC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAjusteBC() {
        return tpAjusteBC;
    }

    /**
     * Define o valor da propriedade tpAjusteBC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAjusteBC(String value) {
        this.tpAjusteBC = value;
    }

    /**
     * Obtém o valor da propriedade xTpAjusteBC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXTpAjusteBC() {
        return xTpAjusteBC;
    }

    /**
     * Define o valor da propriedade xTpAjusteBC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXTpAjusteBC(String value) {
        this.xTpAjusteBC = value;
    }

    /**
     * Obtém o valor da propriedade vTotDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTotDoc() {
        return vTotDoc;
    }

    /**
     * Define o valor da propriedade vTotDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTotDoc(String value) {
        this.vTotDoc = value;
    }

    /**
     * Obtém o valor da propriedade vAjusteAplic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAjusteAplic() {
        return vAjusteAplic;
    }

    /**
     * Define o valor da propriedade vAjusteAplic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAjusteAplic(String value) {
        this.vAjusteAplic = value;
    }

    /**
     * Obtém o valor da propriedade dtEmiDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtEmiDoc() {
        return dtEmiDoc;
    }

    /**
     * Define o valor da propriedade dtEmiDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEmiDoc(String value) {
        this.dtEmiDoc = value;
    }

    /**
     * Obtém o valor da propriedade dtCompDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCompDoc() {
        return dtCompDoc;
    }

    /**
     * Define o valor da propriedade dtCompDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCompDoc(String value) {
        this.dtCompDoc = value;
    }

    /**
     * Obtém o valor da propriedade dFeNacional.
     * 
     * @return
     *     possible object is
     *     {@link TCRTCListaDocDFe }
     *     
     */
    public TCRTCListaDocDFe getDFeNacional() {
        return dFeNacional;
    }

    /**
     * Define o valor da propriedade dFeNacional.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRTCListaDocDFe }
     *     
     */
    public void setDFeNacional(TCRTCListaDocDFe value) {
        this.dFeNacional = value;
    }

    /**
     * Obtém o valor da propriedade docFiscalOutro.
     * 
     * @return
     *     possible object is
     *     {@link TCRTCListaDocFiscalOutro }
     *     
     */
    public TCRTCListaDocFiscalOutro getDocFiscalOutro() {
        return docFiscalOutro;
    }

    /**
     * Define o valor da propriedade docFiscalOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRTCListaDocFiscalOutro }
     *     
     */
    public void setDocFiscalOutro(TCRTCListaDocFiscalOutro value) {
        this.docFiscalOutro = value;
    }

    /**
     * Obtém o valor da propriedade docOutro.
     * 
     * @return
     *     possible object is
     *     {@link TCRTCListaDocOutro }
     *     
     */
    public TCRTCListaDocOutro getDocOutro() {
        return docOutro;
    }

    /**
     * Define o valor da propriedade docOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRTCListaDocOutro }
     *     
     */
    public void setDocOutro(TCRTCListaDocOutro value) {
        this.docOutro = value;
    }

    /**
     * Obtém o valor da propriedade fornec.
     * 
     * @return
     *     possible object is
     *     {@link TCInfoPessoa }
     *     
     */
    public TCInfoPessoa getFornec() {
        return fornec;
    }

    /**
     * Define o valor da propriedade fornec.
     * 
     * @param value
     *     allowed object is
     *     {@link TCInfoPessoa }
     *     
     */
    public void setFornec(TCInfoPessoa value) {
        this.fornec = value;
    }

}
