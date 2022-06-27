package com.bl.addressBook;
import java.util.Scanner;
public class AddressBookUC1 {
    //variables
    private  String FirstName;
    private String LastName;
    private String State;
    private String City;
    private String Address;
    private long ZipCode;
    private long PhoneNO;
    private String Email;
    //getters and setters  for  each variable
    Scanner userinfo = new Scanner(System.in);

    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getState()
    {
        return State;
    }
    public void setState(String state)
    {
        this.State = state;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    //
//    public String getAddress(){
//        return Address;
//    }
//
//
//    public void setAddress(String address) {
//        this.Address = address;
//    }
    public Long getZipCode() {
        return ZipCode;
    }
    public void setZipCode(Long zipCode) {
        ZipCode = zipCode;
    }
    public Long getPhoneNO() {
        return PhoneNO;
    }
    public void setPhoneNO(Long phoneNO) {
        PhoneNO = phoneNO;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email=email;
    }

    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }

    public void display()
    {
        System.out.print("Enter a first name: ");
        setFirstName(userinfo.nextLine());

        System.out.print("Enter a last name: ");
        setLastName(userinfo.nextLine());

        System.out.print("Enter a state: ");
        setState(userinfo.next());

        System.out.print("Enter a city: ");
        setCity(userinfo.next());


        System.out.print("Enter a address: ");
        setAddress(userinfo.next());

        System.out.print("Enter a zipcode: ");
        setZipCode(userinfo.nextLong());


        System.out.print("Enter a phoneNo: ");
        setPhoneNO(userinfo.nextLong());

        System.out.print("Enter a email: ");
        setEmail(userinfo.next());

        System.out.println("name:\t" + this.getFirstName());
        System.out.println("last name:\t" + this.getLastName());
        System.out.println("state:\t" + this.getState());
        System.out.println("zipcode:\t" + this.getZipCode());
        System.out.println("city:\t" + this.getCity());
        System.out.println("phone_no:\t" + this.getPhoneNO());
        System.out.println("email:\t" + this.getEmail());
        System.out.println("email:\t" + this.getEmail());
    }

    public static void main(String[] args)
    {
        AddressBookUC1 user1 = new AddressBookUC1();
        user1.display();
        System.out.println("Successfully Created Contacts");
    }
}
