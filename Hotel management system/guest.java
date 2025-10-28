package hotelresevationsystem;

public class Guest {
    private int FAYDANo; 
    private String guestName;
    private int PhoneNo;
    private String Address;
    

   public Guest(int FAYDANo ,String guestName, int Phone, String Address) {
        this.FAYDANo = FAYDANo;
        this.guestName = guestName;
        this.PhoneNo = Phone;
        this.Address = Address;
        
    }
    
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getContact() {
        return PhoneNo;
    }

    public void setContact(int Phone) {
        this.PhoneNo = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    

    public int getFAYDANo() {
        return FAYDANo;
    }

    public void setFAYDANo(int FAYDANo) {
        this.FAYDANo = FAYDANo;
    }
    
    public String getName() {
    return guestName;
}

    public void displayGuest(){
        System.out.println();
        System.out.println(            Guest Details              );
        System.out.println();
        System.out.println(FAYDA Number  + FAYDANo);
        System.out.println(Name + guestName);
        System.out.println(Phone No + PhoneNo);
        System.out.println(Address  + Address);
                   
    }

}
