package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 3695785534407043974L;

    @Id
    @GeneratedValue
    private int id;
    private String name;
}
