public class User {
    boolean flag = false;
    private String name;
    private String userName;
    private String password;
    private Long phoneNumber;
    
    
    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }
    

    public User(String name, String userName, String password, Long phoneNumber) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


    public boolean comparePhoneNumber(User user){
        //System.out.println(this.phoneNumber+","+user.phoneNumber);
        //flag = (this.phoneNumber == user.phoneNumber);
        flag = this.phoneNumber.equals(user.phoneNumber);
        return flag;
    }
}
