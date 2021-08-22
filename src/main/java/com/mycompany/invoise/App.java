package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;

import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
//le context ou encore le contenu leger spring a besoin de connaitre la classe ou l'objet qu'il utilisera plutôt de lui donner le nom de la class spécifique
    // on va plutôt utiliser le principe du polymorphisme ainsi donc utiliser l'interface du service , du controlleur ou encore du repository
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();
    }
}
