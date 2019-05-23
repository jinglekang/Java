package hibernate.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private Long createDate;

    public Student() {
    }

    public Student(String name, String gender, Long createDate) {
        this.name = name;
        this.gender = gender;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }
}
