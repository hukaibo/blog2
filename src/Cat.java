import com.alibaba.fastjson.JSON;

public class Cat {
    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Cat newCute(String name){
        return new Cat(17,name);
    }

    public static void main(String[] args) {
        Cat cat=new Cat(17,"喵喵");
        String text = JSON.toJSONString(cat);
    }
}
