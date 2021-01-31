public class TestContact {
    public static void main(String[] args) throws Exception {
        Contact contact = new Contact("JOE","Tribiani","Male","joy@trib.com");
        contact.setDateOfBirth("09-09-1990");
        //contact.validate();
       // System.out.println(contact.toString());
        ContactStack contactStack = new ContactStack(4);
       // contactStack.push(contact);
        System.out.println(contactStack.pop());
    }
}
