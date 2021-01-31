import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class ContactStack {
    private int size, top;
    private Contact[] contacts = new Contact[5];
    static Logger logger = Logger.getLogger(ContactStack.class.getName());
    static{
        try {

            logger.addHandler(new FileHandler("calc.log", true));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ContactStack(int size) {
        this.size = size;
        top = 0;
    }
    public void push(Contact contact) throws Exception {
        if(isFull())
        {
            throw new Exception("Stack is full");
        }
        else {
            try {
                contacts[top++] = contact;
                System.out.println("Contact is pushed successfully");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    public int pop() throws Exception {
        if(isEmpty())
        {
            logger.info("Exception Handled");
            throw new Exception("Stack is empty");
        }
        else {
            return top--;
        }
    }
    public boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        if(top==0)
        {
            return true;
        }
        return false;
    }
}
