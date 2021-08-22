package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryDataBase implements InvoiceRepositoryInterface{

    public void create(Invoice invoice){
       /* PreparedStatement pstmt = connexion.prepareStatement("INSERT INTO INVOICE (NUMBER,DESCRIPTION) VALUES (?,?)");
        pstmt.executeUpdate();*/

        System.out.println("DATA BASE Invoices add with Number" + invoice.getNumber() + " for " + invoice.getCustomerName());
    }
}
