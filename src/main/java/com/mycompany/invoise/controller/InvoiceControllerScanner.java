package com.mycompany.invoise.controller;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;

public class InvoiceControllerScanner implements InvoiceControllerInterface{
    private InvoiceServiceInterface invoiceService;


    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }


    @Override
    public void createInvoice() {
        System.out.println("Usage of a Scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virging Galactique");
        invoiceService.createInvoice(invoice);

    }
}
