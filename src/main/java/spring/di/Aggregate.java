package spring.di;

import java.util.*;

public class Aggregate {
    private Set<String> set;
    private String[] string;
    private List<String> list;
    private Map<String, String> map;
    private Properties props;

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getString() {
        return string;
    }

    public void setString(String[] string) {
        this.string = string;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Aggregate{" +
                "set=" + set +
                ", string=" + Arrays.toString(string) +
                ", list=" + list +
                ", map=" + map +
                ", props=" + props +
                '}';
    }
}
