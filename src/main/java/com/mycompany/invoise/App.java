package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;

import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

import com.mycompany.invoise.service.InvoiceServiceInterface;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dans quel est la classe du Controller ? ");
        String controllerClass = sc.nextLine();

        System.out.println("Dans quel est classe du  Service ? ");
        String serviceClass = sc.nextLine();

        System.out.println("Dans quel est classe du  repository  ? ");
        String repositoryClass= sc.nextLine();

        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null ;
        InvoiceRepositoryInterface invoiceRepository = null;
// on va essayé d instancié un objet sur la base d'un nom de classe qui va être donnée par un utilisateur

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoice();


    }
}
