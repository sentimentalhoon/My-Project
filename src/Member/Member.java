package Member;

public class Member {
    String id;
    String name;
    int age;
    Boolean isValid;
    public Member(){

    }
    
    public Member(final String id, final String name, final int age, final Boolean isValid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isValid = isValid;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }
}
