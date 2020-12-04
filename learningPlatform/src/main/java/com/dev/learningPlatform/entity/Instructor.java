package com.dev.learningPlatform.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// TODO : change make mapping through mapid
@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="first_name")
    String firstName;

    @Column(name="last_name")
    String lastName;

    @OneToOne(targetEntity = InstructorDetail.class, cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name="instructor_detail_id", referencedColumnName = "id")
    InstructorDetail instructorDetail;

    public Instructor() {
		super();
	}

	public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", instructorDetail="
				+ instructorDetail + "]";
	}    
}