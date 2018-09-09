import java.util.LinkedList;
import java.util.Scanner;
class Contact_number{

    private String Person_Name;
    private String email;
    
    private Address postalAddrMain;
    private Address postalAddrAlternative;
    
    private Phone phoneMain;
    private Phone phoneAlternative;
    
    public Contact_number(String x, String y)
    {
        Person_Name = x;
        email = y;
    }

    
    public void setMainAddress(Address x)
    {
        postalAddrMain = x;
    }
    
    public void setAltAddress(Address x)
    {
        postalAddrAlternative = x;
    }
    
    public void setPhoneMain(Phone x)
    {
        phoneMain = x;
    }
    
    public void setPhoneAlt(Phone x)
    {
        phoneAlternative = x;
    }
    
    public String toString()
    {
        return Person_Name+"\n"+email;
    }
    
    public void addAddress(int x)
    {
        String addPerson_Name, city ,country;
        int post;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("-------Enter your address details-------");
        
        System.out.print("Country:");
        country = sc.nextLine();
        
        System.out.print("City:");
        city = sc.nextLine();
        
        System.out.print("House No and Street");
        addPerson_Name = sc.nextLine();
        
        System.out.print("Postal code:");
        post = sc.nextInt();
        
        Address tmp = new Address(addPerson_Name, city, country, post);
        
        if(x==1) this.setMainAddress(tmp);
        else if(x==2) this.setAltAddress(tmp);
        
    }
    
    public void addPhone(int x)
    {
        
        int areaCode, prefix, phonNo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Phone detail");
        
        System.out.print("International area code:");
        areaCode = sc.nextInt();
        
        System.out.print("Prefix:");
        prefix = sc.nextInt();
        
        System.out.print("Phone no:");
        phonNo = sc.nextInt();
        
        Phone tmp = new Phone(areaCode, prefix, phonNo);
        if(x==1){ this.setPhoneMain(tmp);}
        else if(x==2) {this.setPhoneAlt(tmp);}
    
    } 
}

class Phone
{
    private int internationalAreaCode;
    private int prefix;
    private int number;
    
    public Phone(int x, int y, int z)
    {
        internationalAreaCode = x;
        prefix = y;
        number = z;
    }
class AddressBook{

    private String introduction="This is the Addressbook";
    private LinkedList<Contact_number> Contact_numbers = new LinkedList<>();

    public AddressBook() {
        System.out.println(introduction);
    }
    public void addContact_number()
    {
        String Person_Name, email;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Please enter your personal details-----: ");
        
        System.out.print("Person_Name:");
        Person_Name = sc.nextLine();
        
        System.out.print("Email:");
        email = sc.nextLine();
        
        
        
        Contact_number tmp = new Contact_number(Person_Name,email);
        tmp.addAddress(1);
        tmp.addPhone(1);
        
        Contact_numbers.add(tmp);
        
    }
       
    public void print()
    {
        for(Contact_number c:Contact_numbers)
        {
            System.out.println(c);
        }
    }
}    
}
class Address{

    private String Person_Name;
    private int postalCode;
    private String city;
    private String country;
    
    public Address(String x, String y, String z, int a){
        Person_Name = x;
        city = y;
        country = z;
        postalCode = a;
    } 
}
public class AddressBookTest {
    
    public static void main(String[] args) {
    
        AddressBook nec = new AddressBook();
        nec.addContact();
        nec.print();
    }  
}
