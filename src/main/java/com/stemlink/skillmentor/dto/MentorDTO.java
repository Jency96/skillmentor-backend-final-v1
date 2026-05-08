package com.stemlink.skillmentor.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MentorDTO {

    private String mentorId;

    @Size(max = 100)
    private String firstName;

    @Size(max = 100)
    private String lastName;

    @Email
    private String email;

    @Size(max = 20)
    private String phoneNumber;

    private String title;
    private String profession;
    private String company;

    private int experienceYears;

    @Size(max = 500)
    private String bio;

    private String profileImageUrl;

    private Integer positiveReviews;
    private Integer totalEnrollments;

    private Boolean isCertified;

    private Integer startYear;   // ✅ MUST be Integer
}
