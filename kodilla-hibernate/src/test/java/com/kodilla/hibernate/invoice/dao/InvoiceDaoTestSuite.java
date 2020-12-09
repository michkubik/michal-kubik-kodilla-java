package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*@ExtendWith(SpringExtension.class)*/
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given

        Product chair = new Product("Chair");
        Product table = new Product("Table");
        Product desk = new Product("Desk");
        Product lamp = new Product("Lamp");

        Item item1 = new Item(chair, new BigDecimal(5), 10);
        Item item3 = new Item(table, new BigDecimal(10), 2);
        Item item2 = new Item(chair, new BigDecimal(5), 5);
        Item item4 = new Item(desk, new BigDecimal(15), 2);
        Item item5 = new Item(table, new BigDecimal(10), 1);
        Item item6 = new Item(lamp, new BigDecimal(5), 3);
        Item item7 = new Item(desk, new BigDecimal(15), 4);

        Invoice invoice1 = new Invoice("001/2020");
        Invoice invoice2 = new Invoice("002/2020");
        Invoice invoice3 = new Invoice("003/2020");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);
        invoice3.getItems().add(item6);
        invoice3.getItems().add(item7);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);
        item6.setInvoice(invoice3);
        item7.setInvoice(invoice3);

        //When
        invoiceDao.save(invoice1);
        int invoice1ID = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2ID = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3ID = invoice3.getId();

        //Then
        assertNotEquals(0, invoice1ID);
        assertNotEquals(0, invoice2ID);
        assertNotEquals(0, invoice3ID);


        //CleanUp
        try {
            invoiceDao.deleteById(invoice1ID);
            invoiceDao.deleteById(invoice2ID);
            invoiceDao.deleteById(invoice3ID);
        } catch (Exception e) {
            //do nothing
        }

    }




}
