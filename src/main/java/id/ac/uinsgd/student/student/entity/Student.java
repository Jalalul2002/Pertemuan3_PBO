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
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotEmpty(message = "Last Name is required")
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotEmpty(message = "Email is required")
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @NotEmpty(message = "Phone Number is required")
    @Column(name = "phonenumber", unique = true, nullable = false)
    private String phonenumber;


}
