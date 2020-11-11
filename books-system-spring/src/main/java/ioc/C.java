package ioc;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class C implements M{
    public void m1(){
        System.out.println("m1调用操作Oracle");
    }
}
