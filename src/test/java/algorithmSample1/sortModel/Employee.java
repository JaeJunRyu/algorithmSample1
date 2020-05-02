package algorithmSample1.sortModel;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private Integer number;

    private String name;

    private Integer age;

    @Builder
    public Employee(Integer number, String name, Integer age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }


}
