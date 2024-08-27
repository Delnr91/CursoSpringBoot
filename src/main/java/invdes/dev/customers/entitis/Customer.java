package invdes.dev.customers.entitis;


import lombok.*;


//con libreria lombok se puede minizar el codigo con anotaciones
/*@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode @ToString*/
//o  se puede minizar aun mas la informacion con la anotacion Data ocupando el patron de diseño builder

@Data
public class Customer {

    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;

}


