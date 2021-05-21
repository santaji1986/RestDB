package org.san.restdb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStudentRequest {
    private Integer rollId;
    private String firstName;
    private String lastName;
    private String city;
}
