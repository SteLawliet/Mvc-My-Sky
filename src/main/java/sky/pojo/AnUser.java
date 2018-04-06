package sky.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by Stelawliet on 18/3/21.
 */

@Component("anuser")
@Scope("singleton")
public class AnUser {
    private String name;
    private Integer age;
    private Object[] likes;
    private List lists;
    private Map map;
    private Properties properties;
    private User user;

    public AnUser() {
    }

    @Override
    public String toString() {
        return "AnUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likes=" + Arrays.toString(likes) +
                ", lists=" + lists +
                ", map=" + map +
                ", properties=" + properties +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    @Resource(name = "user")
    public void setUser(User user) {
        this.user = user;
    }

    public AnUser(String name, Integer age, Object[] likes, List lists, Map map, Properties properties, User user) {
        this.name = name;
        this.age = age;
        this.likes = likes;
        this.lists = lists;
        this.map = map;
        this.properties = properties;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Object[] getLikes() {
        return likes;
    }

    public void setLikes(Object[] likes) {
        this.likes = likes;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
}
