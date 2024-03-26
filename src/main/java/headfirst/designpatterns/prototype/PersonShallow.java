package headfirst.designpatterns.prototype;

import java.util.List;

/**
 * 浅克隆
 */
public class PersonShallow implements Cloneable{
    private String name;
    private String sex;
    private List<String> list;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    // 必须实现Cloneable接口，否则会抛出不支持克隆异常
    @Override
    protected PersonShallow clone(){
        try{
            return (PersonShallow) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}