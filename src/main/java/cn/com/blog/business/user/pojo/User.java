package cn.com.blog.business.user.pojo;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    private String email;

    private Integer phone;

    private String blogName;

    private String blogDomin;

    private String blogPah;

    private String blogTplPath;

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogDomin() {
        return blogDomin;
    }

    public void setBlogDomin(String blogDomin) {
        this.blogDomin = blogDomin;
    }

    public String getBlogPah() {
        return blogPah;
    }

    public void setBlogPah(String blogPah) {
        this.blogPah = blogPah;
    }

    public String getBlogTplPath() {
        return blogTplPath;
    }

    public void setBlogTplPath(String blogTplPath) {
        this.blogTplPath = blogTplPath;
    }

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String password, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}
}