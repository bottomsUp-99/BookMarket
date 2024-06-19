public class member {
    private String memberName;
    private String memberPhoneNum;

    public member(String userName, String userPhoneNum) {
        this.memberName = userName;
        this.memberPhoneNum = userPhoneNum;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhoneNum() {
        return memberPhoneNum;
    }

    public void setMemberPhoneNum(String memberPhoneNum) {
        this.memberPhoneNum = memberPhoneNum;
    }
}