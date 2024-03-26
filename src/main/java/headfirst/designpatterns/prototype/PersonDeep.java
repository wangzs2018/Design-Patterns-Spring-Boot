package headfirst.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 深克隆
 */
public class PersonDeep implements Cloneable {
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

    // 如果没有实现Cloneable接口，会抛出不支持克隆异常
    @Override
    protected PersonDeep clone() {
        try {
            PersonDeep person = (PersonDeep) super.clone();
            List<String> newList = new ArrayList();

            for (String str : this.list) {
                newList.add(str);
            }
            person.setList(newList);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}