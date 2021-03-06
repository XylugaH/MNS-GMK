//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.01 at 10:37:33 AM EET 
//


package com.xylugah.mnsgmk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recipientStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recipientStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="CONSUMER"/>
 *     &lt;enumeration value="CONSIGNOR"/>
 *     &lt;enumeration value="COMMISSIONAIRE"/>
 *     &lt;enumeration value="TAX_DEDUCTION_RECIPIENT"/>
 *     &lt;enumeration value="FOREIGN_ORGANIZATION_BUYER"/>
 *     &lt;enumeration value="TURNOVERS_ON_SALE_RECIPIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recipientStatusType")
@XmlEnum
public enum RecipientStatusType {

    CUSTOMER,
    CONSUMER,
    CONSIGNOR,
    COMMISSIONAIRE,
    TAX_DEDUCTION_RECIPIENT,
    FOREIGN_ORGANIZATION_BUYER,
    TURNOVERS_ON_SALE_RECIPIENT;

    public String value() {
        return name();
    }

    public static RecipientStatusType fromValue(String v) {
        return valueOf(v);
    }

}
