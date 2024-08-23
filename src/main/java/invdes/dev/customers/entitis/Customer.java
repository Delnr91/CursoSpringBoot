package invdes.dev.customers.entitis;


import lombok.*;

import java.util.Objects;

//con libreria lombok se puede minizar el codigo con anotaciones
/*@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode @ToString*/
//o  se puede minizar la informacion con la anotacion Data ocupando el patron de diseño builder

@Data
public class Customer {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;

}


