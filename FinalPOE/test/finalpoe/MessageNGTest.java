/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package finalpoe;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Student
 */
public class MessageNGTest {
    
    public MessageNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of main method, of class Message.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Message.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of sendingMessages method, of class Message.
     */
    @Test
    public void testSendingMessages() {
        System.out.println("sendingMessages");
        Message instance = new Message();
        instance.sendingMessages();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Message instance = new Message();
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String messageID = "";
        int messageNumber = 0;
        String messageText = "";
        Message instance = new Message();
        String expResult = "";
        String result = instance.createMessageHash(messageID, messageNumber, messageText);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of generateMessageID method, of class Message.
     */
    @Test
    public void testGenerateMessageID() {
        System.out.println("generateMessageID");
        Message instance = new Message();
        String expResult = "";
        String result = instance.generateMessageID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        String cellphone = "";
        Message instance = new Message();
        String expResult = "";
        String result = instance.checkRecipientCell(cellphone);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of SentMessage method, of class Message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("SentMessage");
        Message instance = new Message();
        String expResult = "";
        String result = instance.SentMessage();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Message instance = new Message();
        String expResult = "";
        String result = instance.printMessages();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of messageManagementMenu method, of class Message.
     */
    @Test
    public void testMessageManagementMenu() {
        System.out.println("messageManagementMenu");
        Message instance = new Message();
        instance.messageManagementMenu();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findLongestMessage method, of class Message.
     */
    @Test
    public void testFindLongestMessage() {
        System.out.println("findLongestMessage");
        Message instance = new Message();
        instance.findLongestMessage();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchMessageByHashId method, of class Message.
     */
    @Test
    public void testSearchMessageByHashId() {
        System.out.println("searchMessageByHashId");
        Message instance = new Message();
        instance.searchMessageByHashId();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of displayFullReport method, of class Message.
     */
    @Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        Message instance = new Message();
        instance.displayFullReport();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of deleteMessageByHash method, of class Message.
     */
    @Test
    public void testDeleteMessageByHash() {
        System.out.println("deleteMessageByHash");
        Message instance = new Message();
        instance.deleteMessageByHash();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of showAllStoredMessages method, of class Message.
     */
    @Test
    public void testShowAllStoredMessages() {
        System.out.println("showAllStoredMessages");
        Message instance = new Message();
        instance.showAllStoredMessages();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of showDisregardedMessages method, of class Message.
     */
    @Test
    public void testShowDisregardedMessages() {
        System.out.println("showDisregardedMessages");
        Message instance = new Message();
        instance.showDisregardedMessages();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
