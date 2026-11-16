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
 * <p>Classe Java de TCRTCInfoValoresIBSCBS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCRTCInfoValoresIBSCBS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trib" type="{http://www.sped.fazenda.gov.br/nfse}TCRTCInfoTribIBSCBS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCRTCInfoValoresIBSCBS", propOrder = {
    "trib"
})
public class TCRTCInfoValoresIBSCBS {

    @XmlElement(required = true)
    protected TCRTCInfoTribIBSCBS trib;

    /**
     * Obtém o valor da propriedade trib.
     * 
     * @return
     *     possible object is
     *     {@link TCRTCInfoTribIBSCBS }
     *     
     */
    public TCRTCInfoTribIBSCBS getTrib() {
        return trib;
    }

    /**
     * Define o valor da propriedade trib.
     * 
     * @param value
     *     allowed object is
     *     {@link TCRTCInfoTribIBSCBS }
     *     
     */
    public void setTrib(TCRTCInfoTribIBSCBS value) {
        this.trib = value;
    }

}
