package ch15.basic.sec03.exam02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    public String name;
    public int age;


    //     동등 비교 equals & hashCode 구현 필요
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && target.age == age;
        }else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
