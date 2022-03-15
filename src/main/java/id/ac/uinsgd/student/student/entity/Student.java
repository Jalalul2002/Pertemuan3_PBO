package id.ac.uinsgd.student.student.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "First Name is required")
    @Column(name = "first_name", nullable = false)
    private String firstname;

    @NotEmpty(message = "Last Name is required")
    @Column(name = "last_name", nullable = false)
    private String lastname;

    @NotEmpty(message = "Email is required")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @NotEmpty(message = "Phone Number is required")
    @Column(name = "phone_number", unique = true, nullable = false)
    private String phonenumber;


}
