package ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

// A与B是紧耦合关系
@Data
@Component("a")
public class A {
    @Autowired
    M m;
    public void call(){
        m.m1();
    }
}
