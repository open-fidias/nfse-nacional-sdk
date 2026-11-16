//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.11.16 às 04:59:00 PM BRT 
//


package br.com.nfse.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TCInfoAjusteBC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCInfoAjusteBC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="pAjusteBCISSQN" type="{http://www.sped.fazenda.gov.br/nfse}TSDec3V2"/>
 *           &lt;element name="vAjusteBCISSQN" type="{http://www.sped.fazenda.gov.br/nfse}TSDec15V2"/>
 *         &lt;/choice>
 *         &lt;element name="documentos" type="{http://www.sped.fazenda.gov.br/nfse}TCListaDocAjusteBC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCInfoAjusteBC", propOrder = {
    "pAjusteBCISSQN",
    "vAjusteBCISSQN",
    "documentos"
})
public class TCInfoAjusteBC {

    protected String pAjusteBCISSQN;
    protected String vAjusteBCISSQN;
    protected TCListaDocAjusteBC documentos;

    /**
     * Obtém o valor da propriedade pAjusteBCISSQN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAjusteBCISSQN() {
        return pAjusteBCISSQN;
    }

    /**
     * Define o valor da propriedade pAjusteBCISSQN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAjusteBCISSQN(String value) {
        this.pAjusteBCISSQN = value;
    }

    /**
     * Obtém o valor da propriedade vAjusteBCISSQN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAjusteBCISSQN() {
        return vAjusteBCISSQN;
    }

    /**
     * Define o valor da propriedade vAjusteBCISSQN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAjusteBCISSQN(String value) {
        this.vAjusteBCISSQN = value;
    }

    /**
     * Obtém o valor da propriedade documentos.
     * 
     * @return
     *     possible object is
     *     {@link TCListaDocAjusteBC }
     *     
     */
    public TCListaDocAjusteBC getDocumentos() {
        return documentos;
    }

    /**
     * Define o valor da propriedade documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link TCListaDocAjusteBC }
     *     
     */
    public void setDocumentos(TCListaDocAjusteBC value) {
        this.documentos = value;
    }

}
